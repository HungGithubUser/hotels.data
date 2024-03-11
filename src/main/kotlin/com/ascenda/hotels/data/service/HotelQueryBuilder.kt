package com.ascenda.hotels.data.service

import com.ascenda.hotels.data.service.model.Hotel

class HotelQueryBuilder {
    private var idIn: List<String>? = null
    private var destinationId: Long? = null
    fun getHotels(hotelService: HotelService): List<Hotel> {
        return hotelService.getHotels()
            .filter { hotel -> idIn?.contains(hotel.id) ?: true }
            .filter { hotel -> destinationId?.let { hotel.destinationId == it } ?: true }
    }

    fun withIdIn(ids: List<String>?): HotelQueryBuilder {
        idIn = ids
        return this
    }

    fun withDestinationId(id: Long?): HotelQueryBuilder {
        destinationId = id
        return this
    }

}