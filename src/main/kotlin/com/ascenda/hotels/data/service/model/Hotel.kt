package com.ascenda.hotels.data.service.model

data class Hotel(
    val id: String,
    val destinationId: Long,
    val name: String,
    val location: Location,
    // take longest
    val description: String,
    val amenities: Amenities,
    val images: Images,
    val bookingConditions: List<String>
)