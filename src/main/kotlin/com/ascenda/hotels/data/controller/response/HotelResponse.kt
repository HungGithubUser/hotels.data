package com.ascenda.hotels.data.controller.response

import com.ascenda.hotels.data.service.model.Hotel
import com.ascenda.hotels.data.service.model.Location

data class HotelResponse(
    val id: String,
    val destinationId: Long,
    val name: String,
    val location: Location,
    val description: String,
    val amenities: AmenitiesResponse,
    val images: ImagesResponse,
    val bookingConditions: List<String>
){
    constructor(hotel: Hotel) : this(
        hotel.id,
        hotel.destinationId,
        hotel.name,
        hotel.location,
        hotel.description,
        AmenitiesResponse(hotel.amenities.general, hotel.amenities.room),
        ImagesResponse(
            hotel.images.rooms.map { ImageResponse(it.link, it.description) },
            hotel.images.sites.map { ImageResponse(it.link, it.description) },
            hotel.images.amenities.map { ImageResponse(it.link, it.description) }
        ),
        hotel.bookingConditions
    )
}