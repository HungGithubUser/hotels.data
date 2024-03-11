package com.ascenda.hotels.data.service

import com.ascenda.hotels.data.service.model.Hotel

class HotelQueryBuilder {
    private var idIn: List<String>? = null
    private var destinationId: Long? = null
    fun apply(hotels: List<Hotel>): List<Hotel> {
        return hotels
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