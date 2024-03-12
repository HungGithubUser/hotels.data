package com.ascenda.hotels.data.service.model

data class Amenities(val general: List<String>, val room: List<String>) {
    operator fun plus(amenities: Amenities): Amenities {
        return Amenities(
            (general + amenities.general).sortedBy { it.length }.distinctBy { it.replace(" ", "") },
            (room + amenities.room).sortedBy { it.length }.distinctBy { it.replace(" ", "") }
        )
    }

    companion object {
        fun init(general: List<String>, room: List<String>?) =
            Amenities(
                general.map { it.trim().lowercase() },
                room?.map { it.trim().lowercase() } ?: emptyList()
            )
    }
}
