package com.ascenda.hotels.data.controller.response

data class ImagesResponse(
    val rooms: List<ImageResponse>,
    val sites: List<ImageResponse>,
    val amenities: List<ImageResponse>
)