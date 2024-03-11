package com.ascenda.hotels.data.unit.service

import com.ascenda.hotels.data.fixture.HotelFixture.hotelBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelHiltonShinjukuTokyo
import com.ascenda.hotels.data.fixture.HotelFixture.hotelInterContinental
import com.ascenda.hotels.data.service.HotelQueryBuilder
import com.ascenda.hotels.data.service.HotelService
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.whenever

@ExtendWith(MockitoExtension::class)
class HotelQueryBuilderTest {
    @Mock
    private lateinit var hotelService: HotelService

    @Test
    fun `should apply default filter`() {
        val expected =
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            )
        whenever(hotelService.getHotels()).thenReturn(expected)

        val actual = HotelQueryBuilder().getHotels(hotelService)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun `should apply id filters`() {
        whenever(hotelService.getHotels()).thenReturn(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            ))

        val actual = HotelQueryBuilder().withIdIn(listOf(hotelBeachVilla.id)).getHotels(hotelService)

        assertThat(actual, equalTo(listOf(hotelBeachVilla)))
    }

    @Test
    fun `should apply many id filters`() {
        whenever(hotelService.getHotels()).thenReturn(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            ))

        val actual = HotelQueryBuilder().withIdIn(listOf(hotelBeachVilla.id, hotelInterContinental.id)).getHotels(hotelService)

        assertThat(actual, equalTo(listOf(hotelBeachVilla, hotelInterContinental)))
    }

    @Test
    fun `should apply destination Id filters`() {
        whenever(hotelService.getHotels()).thenReturn(
            listOf(
                hotelBeachVilla,
                hotelInterContinental,
                hotelHiltonShinjukuTokyo
            ))

        val actual = HotelQueryBuilder().withDestinationId(hotelBeachVilla.destinationId).getHotels(hotelService)

        assertThat(actual, equalTo(listOf(hotelBeachVilla, hotelInterContinental)))
    }
}