package com.ascenda.hotels.data.functional

import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.web.servlet.get

class HealthCheckTests : FunctionalTestBase() {
    @Test
    fun `Application should be healthy`() {
		webTestClient.get()
			.uri("/health")
			.accept(APPLICATION_JSON)
			.exchange()
			.expectStatus().isOk()
			.expectBody().json("{\"status\":\"UP\"}")
    }
}
