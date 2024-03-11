package com.ascenda.hotels.data.functional

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.get

class HotelControllerTests : FunctionalTestBase() {
    @Test
    fun `Get beach villas by destination should success`() {
        mockMvc.get("/hotels?destinationId=5432").andExpect {
            status { isOk() }
        }
    }

    @Test
    fun `Get beach villas by hotelIds should success`() {
        mockMvc.get("/hotels?hotelIds=iJhz").andExpect {
            status { isOk() }
        }
    }
}