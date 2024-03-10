package com.ascenda.hotels.data.unit.config

import com.ascenda.hotels.data.config.CountryConfiguration
import com.fasterxml.jackson.databind.ObjectMapper
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class CountryConfigurationTest {
    private val mapper = ObjectMapper()

    @Test
    fun `should create codeToCountryMap successfully`() {
        val configuration = CountryConfiguration(mapper)
        val map = configuration.codeToCountryMap()
        assertThat(map["SG"], equalTo("Singapore"))
    }
}