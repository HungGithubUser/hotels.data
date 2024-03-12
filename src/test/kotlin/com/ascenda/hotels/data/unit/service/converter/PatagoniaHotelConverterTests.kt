package com.ascenda.hotels.data.unit.service.converter

import com.ascenda.hotels.data.fixture.HotelFixture
import com.ascenda.hotels.data.service.converter.PatagoniaHotelConverter
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class PatagoniaHotelConverterTests {
    private val converter = PatagoniaHotelConverter()

    @Test
    fun `should convert beach villa hotel successfully`() {
        val expectedHotel = HotelFixture.hotelPatagoniaBeachVilla
        val actualHotel = converter.convert(HotelFixture.patagoniaBeachVilla)
        assertThat(actualHotel, equalTo(expectedHotel))
    }

    @Test
    fun `should convert shijuku hotel successfully`() {
        val expectedHotel = HotelFixture.hotelPatagoniaHiltonShinjukuTokyo
        val actualHotel = converter.convert(HotelFixture.patagoniaHiltonShinjukuTokyo)
        assertThat(actualHotel, equalTo(expectedHotel))
    }
}
