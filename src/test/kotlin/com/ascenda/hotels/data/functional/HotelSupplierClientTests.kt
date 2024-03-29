package com.ascenda.hotels.data.functional

import com.ascenda.hotels.data.client.HotelSupplierClient
import kotlinx.coroutines.runBlocking
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class HotelSupplierClientTests : FunctionalTestBase() {
    @BeforeEach
    fun setUp() {
        hotelServersStub.stub()
    }

    @AfterEach
    fun tearDown() {
        hotelServersStub.reset()
    }

    @Autowired
    lateinit var hotelSupplierClient: HotelSupplierClient

    @Test
    fun `should getAcmeHotels successfully`() = runBlocking {
        val acmeHotels = hotelSupplierClient.getAcmeHotels()
        assertThat(acmeHotels.isEmpty(), equalTo(false))
    }

    @Test
    fun `should getPatagoniaHotels successfully`() = runBlocking {
        val patagoniaHotels = hotelSupplierClient.getPatagoniaHotels()
        assertThat(patagoniaHotels.isEmpty(), equalTo(false))
    }

    @Test
    fun `should getPaperFlyHotels successfully`() = runBlocking {
        val paperFlyHotels = hotelSupplierClient.getPaperFlyHotels()
        assertThat(paperFlyHotels.isEmpty(), equalTo(false))
    }
}
