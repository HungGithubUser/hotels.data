package com.ascenda.hotels.data.service.model

data class Hotel(
    val id: String,
    val destinationId: Long,
    val name: String,
    val location: Location,
    val description: String,
    val amenities: Amenities,
    val images: Images,
    val bookingConditions: List<String>
) {
    operator fun plus(next: Hotel): Hotel {
        return Hotel(
            id = id,
            destinationId = destinationId,
            name = name,
            location = location + next.location,
            amenities = amenities + next.amenities,
            images = images + next.images,
            bookingConditions = bookingConditions + next.bookingConditions,
            description = if (description.length > next.description.length) description else next.description
        )
    }
}