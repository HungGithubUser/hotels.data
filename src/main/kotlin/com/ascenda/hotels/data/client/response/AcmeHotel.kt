package com.ascenda.hotels.data.client.response

import com.fasterxml.jackson.annotation.JsonProperty

data class AcmeHotel(
    @JsonProperty("Id") var id: String,
    @JsonProperty("DestinationId") var destinationId: Long,
    @JsonProperty("Name") var name: String,
    @JsonProperty("Latitude") var latitude: String?,
    @JsonProperty("Longitude") var longitude: String?,
    @JsonProperty("Address") var address: String,
    @JsonProperty("City") var city: String,
    @JsonProperty("Country") var country: String,
    @JsonProperty("PostalCode") var postalCode: String,
    @JsonProperty("Description") var description: String,
    @JsonProperty("Facilities") var facilities: List<String>
)