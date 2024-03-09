package com.ascenda.hotels.data.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "web-client")
data class SupplierConfiguration(
    val urlMap: Map<SupplierName, String>
)

enum class SupplierName {
    ACME, PATAGONIA, PAPERFLY
}
