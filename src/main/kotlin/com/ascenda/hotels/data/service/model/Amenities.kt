package com.ascenda.hotels.data.service.model

data class Amenities(val general: List<String>, val room: List<String>) {
    companion object {
        fun init(general: List<String>, room: List<String>) = Amenities(general.map { it.trim().lowercase() }, room.map { it.trim().lowercase() })
    }
}