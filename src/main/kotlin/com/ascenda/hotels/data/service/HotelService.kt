package com.ascenda.hotels.data.service

import com.ascenda.hotels.data.client.HotelSupplierClient
import com.ascenda.hotels.data.service.converter.AcmeHotelConverter
import com.ascenda.hotels.data.service.converter.PaperFlyHotelConverter
import com.ascenda.hotels.data.service.converter.PatagoniaHotelConverter
import com.ascenda.hotels.data.service.merger.HotelMerger
import com.ascenda.hotels.data.service.model.Hotel
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Service

@Service
class HotelService(
    private val hotelSupplierClient: HotelSupplierClient,
    private val acmeHotelConverter: AcmeHotelConverter,
    private val patagoniaHotelConverter: PatagoniaHotelConverter,
    private val paperFlyHotelConverter: PaperFlyHotelConverter,
    private val hotelMerger: HotelMerger
) {
    suspend fun getHotels(): List<Hotel> = coroutineScope {
        val acmeHotels = async { hotelSupplierClient.getAcmeHotels().map { acmeHotelConverter.convert(it) } }
        val patagoniaHotels =
            async { hotelSupplierClient.getPatagoniaHotels().map { patagoniaHotelConverter.convert(it) } }
        val paperFlyHotels =
            async { hotelSupplierClient.getPaperFlyHotels().map { paperFlyHotelConverter.convert(it) } }
        hotelMerger.merge(acmeHotels.await() + patagoniaHotels.await() + paperFlyHotels.await())
    }
}
