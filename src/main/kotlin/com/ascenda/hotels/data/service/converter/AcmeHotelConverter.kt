package com.ascenda.hotels.data.service.converter

import com.ascenda.hotels.data.client.response.AcmeHotel
import com.ascenda.hotels.data.service.model.Amenities
import com.ascenda.hotels.data.service.model.Hotel
import com.ascenda.hotels.data.service.model.Images
import com.ascenda.hotels.data.service.model.Location

class AcmeHotelConverter(private val codeToCountryMap: Map<String, String>) {
    fun convert(acmeHotel: AcmeHotel): Hotel {
        return Hotel(
            id = acmeHotel.id,
            destinationId = acmeHotel.destinationId,
            location =  Location.init(
                latitude = acmeHotel.latitude,
                longitude = acmeHotel.longitude,
                address = acmeHotel.address,
                city = acmeHotel.city,
                country = codeToCountryMap[acmeHotel.country],
            ),
            name = acmeHotel.name,
            amenities = Amenities.init(
                general = acmeHotel.amenities,
                room = emptyList()
            ),
            description = acmeHotel.description.trim(),
            images = Images(
                rooms = emptyList(),
                sites = emptyList(),
                amenities = emptyList()
            ),
            bookingConditions = emptyList(),
        )
    }
}