package com.ascenda.hotels.data.controller

import com.ascenda.hotels.data.controller.response.HotelResponse
import com.ascenda.hotels.data.service.HotelQueryBuilder
import com.ascenda.hotels.data.service.HotelService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HotelController(private val hotelService: HotelService) {
    @GetMapping(path = ["v1/hotels"])
    suspend fun hotels(
        @RequestParam("destination") destinationId: Long?,
        @RequestParam("hotelIds") hotelIds: List<String>?
    ): List<HotelResponse> {
        return HotelQueryBuilder()
            .withDestinationId(destinationId)
            .withIdIn(hotelIds)
            .apply(hotelService.getHotels())
            .map { HotelResponse(it) }
    }
}