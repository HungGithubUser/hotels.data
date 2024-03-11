package com.ascenda.hotels.data.service.merger

import com.ascenda.hotels.data.service.model.Hotel
import org.springframework.stereotype.Component

@Component
class HotelMerger {
    fun merge(hotels: List<Hotel>): List<Hotel> {
        return hotels.groupBy { it.id }.map { it.value.reduce{ acc, cur -> acc + cur } }
    }
}