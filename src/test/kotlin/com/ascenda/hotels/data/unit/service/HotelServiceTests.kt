package com.ascenda.hotels.data.unit.service

import com.ascenda.hotels.data.client.HotelSupplierClient
import com.ascenda.hotels.data.fixture.HotelFixture.acmeBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelAcmeBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPaperFlyBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPatagoniaBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.paperFlyBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.patagoniaBeachVilla
import com.ascenda.hotels.data.service.HotelService
import com.ascenda.hotels.data.service.converter.AcmeHotelConverter
import com.ascenda.hotels.data.service.converter.PaperFlyHotelConverter
import com.ascenda.hotels.data.service.converter.PatagoniaHotelConverter
import com.ascenda.hotels.data.service.merger.HotelMerger
import kotlinx.coroutines.runBlocking
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

    @Mock
    private lateinit var acmeHotelConverter: AcmeHotelConverter

    @Mock
    private lateinit var patagoniaHotelConverter: PatagoniaHotelConverter

    @Mock
    private lateinit var paperFlyHotelConverter: PaperFlyHotelConverter

    @Mock
    private lateinit var hotelMerger: HotelMerger

    @Test
    fun `should merge value from sources`() = runBlocking {
        whenever(hotelSupplierClient.getAcmeHotels()).thenReturn(listOf(acmeBeachVilla))
        whenever(hotelSupplierClient.getPatagoniaHotels()).thenReturn(listOf(patagoniaBeachVilla))
        whenever(hotelSupplierClient.getPaperFlyHotels()).thenReturn(listOf(paperFlyBeachVilla))
        whenever(acmeHotelConverter.convert(acmeBeachVilla)).thenReturn(hotelAcmeBeachVilla)
        whenever(patagoniaHotelConverter.convert(patagoniaBeachVilla)).thenReturn(hotelPatagoniaBeachVilla)
        whenever(paperFlyHotelConverter.convert(paperFlyBeachVilla)).thenReturn(hotelPaperFlyBeachVilla)
        whenever(hotelMerger.merge(listOf(hotelAcmeBeachVilla, hotelPatagoniaBeachVilla, hotelPaperFlyBeachVilla))).thenReturn(listOf(hotelBeachVilla))

        val actual = service.getHotels()

        assertThat(actual, equalTo(listOf(hotelBeachVilla)))
    }


//    @Test
//    fun `should query sources asynchronously`() {
//        whenever(hotelSupplierClient.getAcmeHotels()).thenAnswer{
//            Thread.sleep(1000)
//            listOf(acmeBeachVilla)
//        }
//        whenever(hotelSupplierClient.getPatagoniaHotels()).thenAnswer{
//            Thread.sleep(2000)
//            listOf(patagoniaBeachVilla)
//        }
//        whenever(hotelSupplierClient.getPaperFlyHotels()).thenAnswer{
//            Thread.sleep(3000)
//            listOf(paperFlyBeachVilla)
//        }
//        whenever(acmeHotelConverter.convert(acmeBeachVilla)).thenReturn(hotelAcmeBeachVilla)
//        whenever(patagoniaHotelConverter.convert(patagoniaBeachVilla)).thenReturn(hotelPatagoniaBeachVilla)
//        whenever(paperFlyHotelConverter.convert(paperFlyBeachVilla)).thenReturn(hotelPaperFlyBeachVilla)
//        whenever(hotelMerger.merge(listOf(hotelAcmeBeachVilla, hotelPatagoniaBeachVilla, hotelPaperFlyBeachVilla))).thenReturn(listOf(hotelBeachVilla))
//        val start = now()
//        val actual = service.getHotels()
//
//        assertThat(actual, equalTo(listOf(hotelBeachVilla)))
//        assertThat(now().toEpochMilli() - start.toEpochMilli() < 4000, equalTo(true))
//    }
}