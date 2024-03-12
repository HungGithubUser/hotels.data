package com.ascenda.hotels.data.unit.service.model

import com.ascenda.hotels.data.service.model.Location
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LocationTest {

    @Test
    fun `should skip empty address when accumulate`() {
        val location1 = Location.init("1.0", "1.0", "address1", "city1", "country1")
        val location2 = Location.init("2.0", "2.0", "", "city2", "country2")

        val result = location1 + location2
        val result2 = location2 + location1

        Assertions.assertEquals("address1", result.address)
        Assertions.assertEquals("address1", result2.address)
    }

    @Test
    fun `should skip blank address when accumulate`() {
        val location1 = Location.init("1.0", "1.0", "address1", "city1", "country1")
        val location2 = Location.init("2.0", "2.0", " ", "city2", "country2")

        val result = location1 + location2
        val result2 = location2 + location1

        Assertions.assertEquals("address1", result.address)
        Assertions.assertEquals("address1", result2.address)
    }
}
