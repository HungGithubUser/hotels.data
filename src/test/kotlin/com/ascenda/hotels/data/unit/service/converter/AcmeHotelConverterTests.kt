package com.ascenda.hotels.data.unit.service.converter

import com.ascenda.hotels.data.service.converter.AcmeHotelConverter
import com.ascenda.hotels.data.fixture.HotelFixture
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.*
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

class AcmeHotelConverterTests {
    private val converter = AcmeHotelConverter(
        mapOf(
            "SG" to "Singapore",
            "JP" to "Japan"
        )
    )

    @Test
    fun `should convert beach villa hotel successfully`() {
        val expectedHotel = HotelFixture.hotelAcmeBeachVilla
        val actualHotel = converter.convert(HotelFixture.acmeBeachVilla)
        assertThat(actualHotel, Matchers.equalTo(expectedHotel))
    }

    @Test
    fun `should convert intercontinental hotel successfully`() {
        val expectedHotel = HotelFixture.hotelAcmeInterContinental
        val actualHotel = converter.convert(HotelFixture.acmeInterContinental)
        assertThat(actualHotel, Matchers.equalTo(expectedHotel))
    }

    @Test
    fun `should convert shijuku hotel successfully`() {
        val expectedHotel = HotelFixture.hotelAcmeHiltonShinjukuTokyo
        val actualHotel = converter.convert(HotelFixture.acmeHiltonShinjukuTokyo)
        assertThat(actualHotel, Matchers.equalTo(expectedHotel))
    }

    @Test
    fun `should return empty country if not in map`(){
        val expectedHotel = HotelFixture.hotelAcmeBeachVilla.copy(location = HotelFixture.hotelAcmeBeachVilla.location.copy(country = ""))
        val actualHotel = converter.convert(HotelFixture.acmeBeachVilla.copy(country = "XX"))
        assertThat(actualHotel, Matchers.equalTo(expectedHotel))
    }
}