package com.ascenda.hotels.data.service.converter

import com.ascenda.hotels.data.client.response.PatagoniaHotel
import com.ascenda.hotels.data.service.model.*
import org.springframework.stereotype.Component

@Component
class PatagoniaHotelConverter {
    fun convert(patagoniaHotel: PatagoniaHotel): Hotel {
        return Hotel(
            id = patagoniaHotel.id,
            destinationId = patagoniaHotel.destinationId,
            location = Location.init(
                latitude = patagoniaHotel.latitude,
                longitude = patagoniaHotel.longitude,
                address = patagoniaHotel.address,
                city = null,
                country = null,
            ),
            name = patagoniaHotel.name,
            amenities = Amenities.init(
                general = emptyList(),
                room = patagoniaHotel.amenities
            ),
            description = patagoniaHotel.description?.trim() ?: EMPTY_FALLBACK_STRING,
            images = Images(
                rooms = patagoniaHotel.images.rooms.map { Image(it.url, it.description) },
                sites = emptyList(),
                amenities = patagoniaHotel.images.amenities.map { Image(it.url, it.description) }
            ),
            bookingConditions = emptyList(),
        )
    }

}
