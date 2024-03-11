package com.ascenda.hotels.data.service.converter

import com.ascenda.hotels.data.client.response.PaperFlyHotel
import com.ascenda.hotels.data.service.model.*
import org.springframework.stereotype.Component

@Component
class PaperFlyHotelConverter {
    fun convert(paperFlyHotel: PaperFlyHotel): Hotel {
        return Hotel(
            id = paperFlyHotel.id,
            destinationId = paperFlyHotel.destinationId,
            location = paperFlyHotel.location.let {
                Location.init(
                    latitude = null,
                    longitude = null,
                    address = it.address,
                    city = null,
                    country = it.country
                )
            },
            name = paperFlyHotel.hotelName,
            amenities = paperFlyHotel.amenities.let {
                Amenities.init(
                    general = it.general,
                    room = it.room
                )
            },
            description = paperFlyHotel.description.trim(),
            images = paperFlyHotel.images.let {
                Images(
                    rooms = it.rooms.map { image -> Image(image.link, image.caption) },
                    sites = it.sites.map { image -> Image(image.link, image.caption) },
                    amenities = emptyList()
                )
            },
            bookingConditions = paperFlyHotel.bookingConditions,
        )
    }
}
