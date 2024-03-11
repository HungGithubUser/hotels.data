package com.ascenda.hotels.data.functional

import org.junit.jupiter.api.Test
import org.springframework.http.MediaType

class SwaggerUiTests : FunctionalTestBase() {
    @Test
    fun `Application should have swagger UI`() {
        webTestClient.get()
            .uri("/webjars/swagger-ui/index.html")
            .exchange()
            .expectStatus().isOk()
    }
}