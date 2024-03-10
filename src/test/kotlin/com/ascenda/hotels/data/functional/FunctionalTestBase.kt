package com.ascenda.hotels.data.functional

import com.ascenda.hotels.data.config.ResourceLoader
import com.ascenda.hotels.data.config.SupplierName
import org.mockserver.client.MockServerClient
import org.mockserver.configuration.ClientConfiguration
import org.mockserver.model.HttpRequest
import org.mockserver.model.HttpResponse
import org.mockserver.model.JsonBody
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.springframework.test.web.servlet.MockMvc
import org.testcontainers.containers.MockServerContainer
import org.testcontainers.utility.DockerImageName

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("functionalTest")
class FunctionalTestBase {
    @Autowired
    protected lateinit var mockMvc: MockMvc

    companion object {
        @JvmStatic
        protected val mockServer = MockServerContainer(DockerImageName.parse("mockserver/mockserver:mockserver-5.15.0"))
            .apply {
                withReuse(true)
                start()
            }

        @JvmStatic
        protected val hotelServersStub = HotelServersStub(mockServer)

        @JvmStatic
        @DynamicPropertySource
        fun properties(registry: DynamicPropertyRegistry) {
            registry.add("web-client.urlMap") {
                mapOf(
                    SupplierName.ACME to "${mockServer.endpoint}/acme",
                    SupplierName.PAPERFLY to "${mockServer.endpoint}/paperflies",
                    SupplierName.PATAGONIA to "${mockServer.endpoint}/patagonia",
                )
            }
        }
    }
}

class HotelServersStub(private val mockServer: MockServerContainer) {
    private val mockServerClient by lazy {
        MockServerClient(
            ClientConfiguration.clientConfiguration().maxFutureTimeoutInMillis(60000),
            mockServer.host,
            mockServer.serverPort
        )
    }

    fun stub() {
        stubAcme()
        stubPaperfly()
        stubPatagonia()
    }

    fun reset() {
        mockServerClient.reset()
    }

    private fun stubPatagonia() {
        mockServerClient.`when`(HttpRequest.request("/patagonia"))
            .respond(
                HttpResponse.response()
                    .withStatusCode(200)
                    .withBody(JsonBody.json(ResourceLoader.loadAsString("patagonia.json")))
            )
    }

    private fun stubPaperfly() {
        mockServerClient.`when`(HttpRequest.request("/paperflies"))
            .respond(
                HttpResponse.response()
                    .withStatusCode(200)
                    .withBody(JsonBody.json(ResourceLoader.loadAsString("paperflies.json")))
            )
    }

    private fun stubAcme() {
        mockServerClient.`when`(HttpRequest.request("/acme"))
            .respond(
                HttpResponse.response()
                    .withStatusCode(200)
                    .withBody(JsonBody.json(ResourceLoader.loadAsString("acme.json")))
            )
    }
}

