package com.ascenda.hotels.data.client.response

import com.fasterxml.jackson.annotation.JsonProperty

data class PatagoniaHotel(
    @JsonProperty("id") val id: String,
    @JsonProperty("destination") val destinationId: Long,
    @JsonProperty("name") val name: String,
    @JsonProperty("lat") val latitude: String,
    @JsonProperty("lng") val longitude: String,
    @JsonProperty("address") val address: String?,
    @JsonProperty("info") val description: String?,
    @JsonProperty("amenities") val amenities: List<String>?,
    @JsonProperty("images") val images: PatagoniaImages
)

class PatagoniaImages(
    @JsonProperty("rooms") val rooms: List<PatagoniaImage>,
    @JsonProperty("amenities") val amenities: List<PatagoniaImage>
)

data class PatagoniaImage(
    @JsonProperty("url") val url: String,
    @JsonProperty("description") val description: String
)