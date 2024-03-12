package com.ascenda.hotels.data.service.model

data class Images(
    val rooms: List<Image>,
    val sites: List<Image>,
    val amenities: List<Image>
) {
    operator fun plus(images: Images): Images {
        return Images(
            (rooms + images.rooms).distinctBy { it.link },
            (sites + images.sites).distinctBy { it.link },
            (amenities + images.amenities).distinctBy { it.link }
        )
    }
}
