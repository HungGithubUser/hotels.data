package com.ascenda.hotels.data.unit.service

import com.ascenda.hotels.data.fixture.HotelFixture.hotelBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelHiltonShinjukuTokyo
import com.ascenda.hotels.data.fixture.HotelFixture.hotelInterContinental
import com.ascenda.hotels.data.service.HotelQueryBuilder
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class HotelQueryBuilderTest {

    @Test
    fun `should apply default filter`() {
        val expected =
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            )

        val actual = HotelQueryBuilder().apply(expected)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun `should apply id filters`() {
        val actual = HotelQueryBuilder().withIdIn(listOf(hotelBeachVilla.id)).apply(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            )
        )
        assertThat(actual, equalTo(listOf(hotelBeachVilla)))
    }

    @Test
    fun `should apply many id filters`() {
        val actual = HotelQueryBuilder().withIdIn(listOf(hotelBeachVilla.id, hotelInterContinental.id)).apply(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            )
        )
        assertThat(actual, equalTo(listOf(hotelBeachVilla, hotelInterContinental)))
    }

    @Test
    fun `should apply destination Id filters`() {
        val actual = HotelQueryBuilder().withDestinationId(hotelBeachVilla.destinationId).apply(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            )
        )
        assertThat(actual, equalTo(listOf(hotelBeachVilla, hotelInterContinental)))
    }
}
