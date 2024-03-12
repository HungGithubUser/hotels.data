package com.ascenda.hotels.data.functional

import org.junit.jupiter.api.Test
import org.springframework.http.MediaType

class HotelControllerTests : FunctionalTestBase() {
    @Test
    fun `Get beach villas should success`() {
        webTestClient.get()
            .uri("/v1/hotels")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
    }

    @Test
    fun `Get beach villas by destination should success`() {
        webTestClient.get()
            .uri("/v1/hotels?destinationId=5432")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
    }

    @Test
    fun `Get beach villas by hotelIds should success`() {
        webTestClient.get()
            .uri("/v1/hotels?destinationId=iJhz")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
    }
}
