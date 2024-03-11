package com.ascenda.hotels.data.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class RestTemplateConfiguration {
    @Bean
    fun webClient(): WebClient {
        return WebClient.create()
    }
}