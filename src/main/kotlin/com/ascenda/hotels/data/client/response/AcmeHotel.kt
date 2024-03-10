package com.ascenda.hotels.data.client.response

import com.fasterxml.jackson.annotation.JsonProperty

data class AcmeHotel(
    @JsonProperty("Id") val id: String,
    @JsonProperty("DestinationId") val destinationId: Long,
    @JsonProperty("Name") val name: String,
    @JsonProperty("Latitude") val latitude: String?,
    @JsonProperty("Longitude") val longitude: String?,
    @JsonProperty("Address") val address: String,
    @JsonProperty("City") val city: String,
    @JsonProperty("Country") val country: String,
    @JsonProperty("PostalCode") val postalCode: String,
    @JsonProperty("Description") val description: String,
    @JsonProperty("Facilities") val amenities: List<String>
)