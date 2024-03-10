package com.ascenda.hotels.data.unit.service

import com.ascenda.hotels.data.client.HotelSupplierClient
import com.ascenda.hotels.data.service.HotelService
import com.ascenda.hotels.data.fixture.HotelFixture.acmeBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.paperFlyBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.patagoniaBeachVilla
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.whenever

@ExtendWith(MockitoExtension::class)
class HotelServiceTests {
    @InjectMocks
    private lateinit var service: HotelService

    @Mock
    private lateinit var hotelSupplierClient: HotelSupplierClient

    @Test
    fun `should merge value from sources`() {
        whenever(hotelSupplierClient.getAcmeHotels()).thenReturn(listOf(acmeBeachVilla))
        whenever(hotelSupplierClient.getPatagoniaHotels()).thenReturn(listOf(patagoniaBeachVilla))
        whenever(hotelSupplierClient.getPaperFlyHotels()).thenReturn(listOf(paperFlyBeachVilla))
        assertThat(service.getMergedHotels().size, equalTo(1))
        assertThat(service.getMergedHotels()[0], equalTo(hotelBeachVilla))
    }
}