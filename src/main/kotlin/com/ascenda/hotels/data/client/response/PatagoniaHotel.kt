package com.ascenda.hotels.data.client.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

data class PatagoniaHotel(
    @JsonProperty("id") val id: String,
    @JsonProperty("destination") val destination: Long,
    @JsonProperty("name") val name: String,
    @JsonProperty("lat") val latitude: BigDecimal,
    @JsonProperty("lng") val longitude: BigDecimal,
    @JsonProperty("address") val address: String?,
    @JsonProperty("info") val info: String?,
    @JsonProperty("amenities") val amenities: List<String>?,
    @JsonProperty("images") val images: PatagoniaImages
)

class PatagoniaImages (
    @JsonProperty("rooms")
    val rooms: List<PatagoniaRoom>,
    @JsonProperty("amenities")
    val amenities: List<PatagoniaAmenity>
)

data class PatagoniaRoom(
    @JsonProperty("url") val url: String,
    @JsonProperty("description") val description: String
)

data class PatagoniaAmenity(
    @JsonProperty("url") val url: String? = null,
    @JsonProperty("description") val description: String? = null
)