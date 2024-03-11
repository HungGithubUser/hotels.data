package com.ascenda.hotels.data.unit.service.merger

import com.ascenda.hotels.data.fixture.HotelFixture.hotelAcmeBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelAcmeHiltonShinjukuTokyo
import com.ascenda.hotels.data.fixture.HotelFixture.hotelAcmeInterContinental
import com.ascenda.hotels.data.fixture.HotelFixture.hotelBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelHiltonShinjukuTokyo
import com.ascenda.hotels.data.fixture.HotelFixture.hotelInterContinental
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPaperFlyBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPaperFlyHiltonShinjukuTokyo
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPaperFlyInterContinental
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPatagoniaBeachVilla
import com.ascenda.hotels.data.fixture.HotelFixture.hotelPatagoniaHiltonShinjukuTokyo
import com.ascenda.hotels.data.service.merger.HotelMerger
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class HotelMergerTests {
    private val hotelMerger = HotelMerger()

    @Test
    fun shouldMergeHotelsCorrectly() {
        val actualMergedHotel = hotelMerger.merge(
            listOf(
                hotelAcmeBeachVilla,
                hotelAcmeInterContinental,
                hotelAcmeHiltonShinjukuTokyo,
                hotelPatagoniaBeachVilla,
                hotelPatagoniaHiltonShinjukuTokyo,
                hotelPaperFlyBeachVilla,
                hotelPaperFlyInterContinental,
                hotelPaperFlyHiltonShinjukuTokyo
            )
        )
        assertThat(
            actualMergedHotel, equalTo(
                listOf(
                    hotelBeachVilla,
                    hotelInterContinental,
                    hotelHiltonShinjukuTokyo
                )
            )
        )
    }
}

