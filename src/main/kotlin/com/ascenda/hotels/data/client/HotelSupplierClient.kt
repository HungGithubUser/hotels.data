package com.ascenda.hotels.data.client

import com.ascenda.hotels.data.client.response.AcmeHotel
import com.ascenda.hotels.data.client.response.PaperFlyHotel
import com.ascenda.hotels.data.client.response.PatagoniaHotel
import com.ascenda.hotels.data.config.SupplierConfiguration
import com.ascenda.hotels.data.config.SupplierName.ACME
import com.ascenda.hotels.data.config.SupplierName.PAPERFLY
import com.ascenda.hotels.data.config.SupplierName.PATAGONIA
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Service
class HotelSupplierClient(
    private val supplierConfiguration: SupplierConfiguration,
    private val webClient: WebClient
) {
    suspend fun getAcmeHotels(): List<AcmeHotel> {
        return webClient.get().uri(supplierConfiguration.urlMap[ACME]!!)
            .accept(APPLICATION_JSON)
            .retrieve()
            .awaitBody<List<AcmeHotel>>()
    }

    suspend fun getPatagoniaHotels(): List<PatagoniaHotel> {
        return webClient.get().uri(supplierConfiguration.urlMap[PATAGONIA]!!)
            .accept(APPLICATION_JSON)
            .retrieve()
            .awaitBody<List<PatagoniaHotel>>()
    }

    suspend fun getPaperFlyHotels(): List<PaperFlyHotel> {
        return webClient.get().uri(supplierConfiguration.urlMap[PAPERFLY]!!)
            .accept(APPLICATION_JSON)
            .retrieve()
            .awaitBody<List<PaperFlyHotel>>()
    }
}
