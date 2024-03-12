package com.ascenda.hotels.data.client.response

import com.fasterxml.jackson.annotation.JsonProperty

data class PaperFlyHotel(
    @JsonProperty("hotel_id") val id: String,
    @JsonProperty("destination_id") val destinationId: Long,
    @JsonProperty("hotel_name") val hotelName: String,
    @JsonProperty("location") val location: PaperFlyLocation,
    @JsonProperty("details") val description: String,
    @JsonProperty("amenities") val amenities: PaperFlyAmenities,
    @JsonProperty("images") val images: PaperFlyImages,
    @JsonProperty("booking_conditions") val bookingConditions: List<String>
)

data class PaperFlyLocation(
    @JsonProperty("address") val address: String,
    @JsonProperty("country") val country: String
)

data class PaperFlyAmenities(
    @JsonProperty("general") val general: List<String>,
    @JsonProperty("room") val room: List<String>
)

data class PaperFlyImage(
    @JsonProperty("link") val link: String,
    @JsonProperty("caption") val caption: String
)

data class PaperFlyImages(
    @JsonProperty("rooms") val rooms: List<PaperFlyImage>,
    @JsonProperty("site") val sites: List<PaperFlyImage>
)
