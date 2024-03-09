package com.ascenda.hotels.data.client

import com.ascenda.hotels.data.config.SupplierConfiguration
import com.ascenda.hotels.data.config.SupplierName.*
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class HotelSupplierClient(
    private val supplierConfiguration: SupplierConfiguration,
    private val restTemplate: RestTemplate
) {
    fun getAcmeHotels(): List<AcmeHotel> {
        return restTemplate.getForEntity(
            supplierConfiguration.urlMap[ACME]!!,
            Array<AcmeHotel>::class.java
        ).body!!.toList()
    }
}


data class AcmeHotel(
    val Id: String,
    val DestinationId: Long,
    val Name: String,
    val Latitude: String?,
    val Longitude: String?,
    val Address: String,
    val City: String,
    val Country: String,
    val PostalCode: String,
    val Description: String,
    val Facilities: List<String>,
)
