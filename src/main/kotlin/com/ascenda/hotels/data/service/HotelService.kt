package com.ascenda.hotels.data.service

import com.ascenda.hotels.data.client.HotelSupplierClient
import com.ascenda.hotels.data.service.converter.AcmeHotelConverter
import com.ascenda.hotels.data.service.converter.PaperFlyHotelConverter
import com.ascenda.hotels.data.service.converter.PatagoniaHotelConverter
import com.ascenda.hotels.data.service.merger.HotelMerger
import com.ascenda.hotels.data.service.model.Hotel
import org.springframework.stereotype.Service

@Service
class HotelService(
    private val hotelSupplierClient: HotelSupplierClient,
    private val acmeHotelConverter: AcmeHotelConverter,
    private val patagoniaHotelConverter: PatagoniaHotelConverter,
    private val paperFlyHotelConverter: PaperFlyHotelConverter,
    private val hotelMerger: HotelMerger
) {
    fun getHotels(): List<Hotel> {
        return hotelMerger.merge(
            hotelSupplierClient.getAcmeHotels().map { acmeHotelConverter.convert(it) } +
                    hotelSupplierClient.getPatagoniaHotels().map { patagoniaHotelConverter.convert(it) } +
                    hotelSupplierClient.getPaperFlyHotels().map { paperFlyHotelConverter.convert(it) }
        )
    }
}

