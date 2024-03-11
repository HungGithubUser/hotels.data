package com.ascenda.hotels.data.service.model

import com.ascenda.hotels.data.service.converter.EMPTY_FALLBACK_STRING
import java.math.BigDecimal

data class Location(
    val latitude: BigDecimal?,
    val longitude: BigDecimal?,
    val address: String,
    val city: String,
    val country: String
) {
    operator fun plus(location: Location): Location {
        return Location(
            latitude ?: location.latitude,
            longitude ?: location.longitude,
            address.ifEmpty { location.address },
            city.ifEmpty { location.city },
            country.ifEmpty { location.country },
        )
    }

    companion object {
        fun init(
            latitude: String?,
            longitude: String?,
            address: String?,
            city: String?,
            country: String?
        ) = Location(
            latitude?.toBigDecimalOrNull(),
            longitude?.toBigDecimalOrNull(),
            address?.trim() ?: EMPTY_FALLBACK_STRING,
            city ?: EMPTY_FALLBACK_STRING,
            country ?: EMPTY_FALLBACK_STRING
        )
    }
}