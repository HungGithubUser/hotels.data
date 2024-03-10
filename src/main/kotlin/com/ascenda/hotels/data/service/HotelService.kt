package com.ascenda.hotels.data.service

import com.ascenda.hotels.data.client.HotelSupplierClient
import com.ascenda.hotels.data.service.model.Amenities
import com.ascenda.hotels.data.service.model.Hotel
import com.ascenda.hotels.data.service.model.Images
import com.ascenda.hotels.data.service.model.Location
import java.math.BigDecimal

class HotelService(
    private val hotelSupplierClient: HotelSupplierClient,
) {
    fun getMergedHotels(): List<Hotel> {
        val acmeHotels = hotelSupplierClient.getAcmeHotels()
        val patagoniaHotels = hotelSupplierClient.getPatagoniaHotels()
        val paperFlyHotels = hotelSupplierClient.getPaperFlyHotels()
        return listOf(
            Hotel(
                acmeHotels[0].id,
                acmeHotels[0].destinationId,
                acmeHotels[0].name,
                // if khac nhau -> log -> top down alphabet
                // TODO: save all db name + nguon -> if same source + name different alert -> analytics
                Location(
                    // if khac nhau > thresh hold -> log warning -> top down alphabet
                    BigDecimal.ZERO,
                    BigDecimal.ZERO,
                    // if khac nhau -> log -> top down alphabet
                    // TODO: save all db name + nguon -> if same source + name different alert -> analytics
                    "",
                    "",
                    // MAP -> COUNTRYCODE -> COOUNTRY -> CITY -> DISTRICT -> STREET
                    ""
                ),
                "",
                //
                Amenities(listOf(), listOf()),
                Images(listOf(), listOf(), listOf()),
                listOf()
            )
            //TODO: save more data/serve more data
        )
    }
}