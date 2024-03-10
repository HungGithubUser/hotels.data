package com.ascenda.hotels.data.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CountryConfiguration(private val objectMapper: ObjectMapper){
    @Bean
    fun codeToCountryMap(): Map<String, String> {
        return objectMapper.readValue(ResourceLoader.loadAsString("countries.json"), Array<Country>::class.java)
            .associateBy ({ it.code }, { it.name })
    }
}