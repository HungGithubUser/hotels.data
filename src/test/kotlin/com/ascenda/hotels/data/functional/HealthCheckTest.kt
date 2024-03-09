package com.ascenda.hotels.data.functional

import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.get

class HealthCheckTest : FunctionalTestBase() {
    @Test
    fun `Application should be healthy`() {
		mockMvc.get("/health").andExpect {
			status { isOk() }
			jsonPath("$.status", equalTo("UP"))
		}
    }
}
