package com.ascenda.hotels.data.service.model

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class LocationTest {
    @Test
    fun `Should choose non-empty city and country over empty city`() {
        val actual = Location(
            latitude = null,
            longitude = null,
            address = "address",
            city = "",
            country = ""
        ) + Location(
            latitude = null,
            longitude = null,
            address = "address",
            city = "city",
            country = "country"
        )

        val actual2 = Location(
            latitude = null,
            longitude = null,
            address = "address",
            city = "city",
            country = "country"
        ) + Location(
            latitude = null,
            longitude = null,
            address = "address",
            city = "",
            country = ""
        )

        assertThat(actual.country, equalTo("country"))
        assertThat(actual.city, equalTo("city"))

        assertThat(actual2.country, equalTo("country"))
        assertThat(actual2.city, equalTo("city"))
    }
}
