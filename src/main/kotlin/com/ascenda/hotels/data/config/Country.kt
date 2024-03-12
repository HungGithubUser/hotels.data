package com.ascenda.hotels.data.config

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Country(
    @JsonProperty("code") val code: String,
    @JsonProperty("name") val name: String
)
