package com.ascenda.hotels.data.client

import com.ascenda.hotels.data.client.response.AcmeHotel
import com.ascenda.hotels.data.client.response.PaperFlyHotel
import com.ascenda.hotels.data.client.response.PatagoniaHotel
import com.ascenda.hotels.data.config.SupplierConfiguration
import com.ascenda.hotels.data.config.SupplierName.*
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class HotelSupplierClient(
    private val supplierConfiguration: SupplierConfiguration, private val restTemplate: RestTemplate
) {
    fun getAcmeHotels(): List<AcmeHotel> {
        return restTemplate.getForEntity(
            supplierConfiguration.urlMap[ACME]!!,
            Array<AcmeHotel>::class.java
        ).body!!.toList()
    }

    fun getPatagoniaHotels(): List<PatagoniaHotel> {
        return restTemplate.getForEntity(
            supplierConfiguration.urlMap[PATAGONIA]!!,
            Array<PatagoniaHotel>::class.java
        ).body!!.toList()
    }

    fun getPaperFlyHotels(): List<PaperFlyHotel> {
        return restTemplate.getForEntity(
            supplierConfiguration.urlMap[PAPERFLY]!!,
            Array<PaperFlyHotel>::class.java
        ).body!!.toList()
    }
}
