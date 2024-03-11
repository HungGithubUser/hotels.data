package com.ascenda.hotels.data.unit.service.converter

import com.ascenda.hotels.data.fixture.HotelFixture
import com.ascenda.hotels.data.service.converter.PaperFlyHotelConverter
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class PaperFlyHotelConverterTests {
    private val converter = PaperFlyHotelConverter()

    @Test
    fun `should convert beach villa hotel successfully`() {
        val expectedHotel = HotelFixture.hotelPaperFlyBeachVilla
        val actualHotel = converter.convert(HotelFixture.paperFlyBeachVilla)
        assertThat(actualHotel, equalTo(expectedHotel))
    }
}