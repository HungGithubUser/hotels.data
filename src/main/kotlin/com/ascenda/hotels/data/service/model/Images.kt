package com.ascenda.hotels.data.service.model

data class Images(
    // if name khac nhau + link same -> log warning -> top down alphabet
    // merge link+name same
    val rooms: List<Image>,
    val sites: List<Image>,
    val amenities: List<Image>
)