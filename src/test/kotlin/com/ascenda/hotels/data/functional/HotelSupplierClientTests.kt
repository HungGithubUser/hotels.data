package com.ascenda.hotels.data.functional

import com.ascenda.hotels.data.client.HotelSupplierClient
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class HotelSupplierClientTests : FunctionalTestBase() {
    @Autowired
    lateinit var hotelSupplierClient: HotelSupplierClient

    @Test
    fun `should get supplier data successfully`() {
        val acmeHotels = hotelSupplierClient.getAcmeHotels()
    }

}