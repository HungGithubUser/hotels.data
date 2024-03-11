package com.ascenda.hotels.data.fixture

import com.ascenda.hotels.data.client.response.*
import com.ascenda.hotels.data.service.converter.EMPTY_FALLBACK_STRING
import com.ascenda.hotels.data.service.model.*
import java.math.BigDecimal

object HotelFixture {
    val acmeBeachVilla = AcmeHotel(
        id = "iJhz",
        destinationId = 5432,
        name = "Beach Villas Singapore",
        latitude = "1.264751",
        longitude = "103.824006",
        address = " 8 Sentosa Gateway, Beach Villas ",
        city = "Singapore",
        country = "SG",
        postalCode = "098269",
        description = "  This 5 star hotel is located on the coastline of Singapore.",
        amenities = listOf(
            "Pool", "BusinessCenter", "WiFi ", "DryCleaning", " Breakfast"
        )
    )

    val acmeInterContinental = AcmeHotel(
        id = "SjyX",
        destinationId = 5432,
        name = "InterContinental Singapore Robertson Quay",
        latitude = null,
        longitude = null,
        address = " 1 Nanson Road",
        city = "Singapore",
        country = "SG",
        postalCode = "238909",
        description = "Enjoy sophisticated waterfront living at the new InterContinental® Singapore Robertson Quay, luxury's preferred address nestled in the heart of Robertson Quay along the Singapore River, with the CBD just five minutes drive away. Magnifying the comforts of home, each of our 225 studios and suites features a host of thoughtful amenities that combine modernity with elegance, whilst maintaining functional practicality. The hotel also features a chic, luxurious Club InterContinental Lounge.",
        amenities = listOf(
            "Pool", "WiFi ", "Aircon", "BusinessCenter", "BathTub", "Breakfast", "DryCleaning", "Bar"
        )
    )

    val acmeHiltonShinjukuTokyo = AcmeHotel(
        id = "f8c9",
        destinationId = 1122,
        name = "Hilton Shinjuku Tokyo",
        latitude = EMPTY_FALLBACK_STRING,
        longitude = EMPTY_FALLBACK_STRING,
        address = "160-0023, SHINJUKU-KU, 6-6-2 NISHI-SHINJUKU, JAPAN",
        city = "Tokyo",
        country = "JP",
        postalCode = "160-0023",
        description = "Hilton Tokyo is located in Shinjuku, the heart of Tokyo's business, shopping and entertainment district, and is an ideal place to experience modern Japan. A complimentary shuttle operates between the hotel and Shinjuku station and the Tokyo Metro subway is connected to the hotel. Relax in one of the modern Japanese-style rooms and admire stunning city views. The hotel offers WiFi and internet access throughout all rooms and public space.",
        amenities = listOf(
            "Pool", "WiFi ", "BusinessCenter", "DryCleaning", " Breakfast", "Bar", "BathTub"
        )
    )

    val hotelAcmeBeachVilla = Hotel(
        id = "iJhz", destinationId = 5432, name = "Beach Villas Singapore", location = Location(
            latitude = BigDecimal("1.264751"),
            longitude = BigDecimal("103.824006"),
            address = "8 Sentosa Gateway, Beach Villas",
            city = "Singapore",
            country = "Singapore",
        ), amenities = Amenities(
            general = listOf(
                "pool", "business center", "wi fi", "dry cleaning", "breakfast"
            ),
            room = emptyList()
        ), description = "This 5 star hotel is located on the coastline of Singapore.", images = Images(
            rooms = emptyList(), sites = emptyList(), amenities = emptyList()
        ), bookingConditions = emptyList()
    )

    val hotelAcmeInterContinental = Hotel(
        id = "SjyX",
        destinationId = 5432,
        name = "InterContinental Singapore Robertson Quay",
        location = Location(
            latitude = null,
            longitude = null,
            address = "1 Nanson Road",
            city = "Singapore",
            country = "Singapore",
        ),
        amenities = Amenities(
            general = listOf(
                "pool", "wi fi", "aircon", "business center", "bath tub", "breakfast", "dry cleaning", "bar"
            ), room = emptyList()
        ),
        description = "Enjoy sophisticated waterfront living at the new InterContinental® Singapore Robertson Quay, luxury's preferred address nestled in the heart of Robertson Quay along the Singapore River, with the CBD just five minutes drive away. Magnifying the comforts of home, each of our 225 studios and suites features a host of thoughtful amenities that combine modernity with elegance, whilst maintaining functional practicality. The hotel also features a chic, luxurious Club InterContinental Lounge.",
        images = Images(
            rooms = emptyList(), sites = emptyList(), amenities = emptyList()
        ),
        bookingConditions = emptyList()
    )

    val hotelAcmeHiltonShinjukuTokyo = Hotel(
        id = "f8c9",
        destinationId = 1122,
        name = "Hilton Shinjuku Tokyo",
        location = Location(
            latitude = null,
            longitude = null,
            address = "160-0023, SHINJUKU-KU, 6-6-2 NISHI-SHINJUKU, JAPAN",
            city = "Tokyo",
            country = "Japan"
        ),
        amenities = Amenities(
            general = listOf(
                "pool", "wi fi", "business center", "dry cleaning", "breakfast", "bar", "bath tub"
            ), room = emptyList()
        ),
        description = "Hilton Tokyo is located in Shinjuku, the heart of Tokyo's business, shopping and entertainment district, and is an ideal place to experience modern Japan. A complimentary shuttle operates between the hotel and Shinjuku station and the Tokyo Metro subway is connected to the hotel. Relax in one of the modern Japanese-style rooms and admire stunning city views. The hotel offers WiFi and internet access throughout all rooms and public space.",
        images = Images(
            rooms = emptyList(), sites = emptyList(), amenities = emptyList()
        ),
        bookingConditions = emptyList()
    )

    val patagoniaBeachVilla = PatagoniaHotel(
        id = "iJhz",
        destinationId = 5432,
        name = "Beach Villas Singapore",
        latitude = "1.264751",
        longitude = "103.824006",
        address = "8 Sentosa Gateway, Beach Villas, 098269",
        description = "Located at the western tip of Resorts World Sentosa, guests at the Beach Villas are guaranteed privacy while they enjoy spectacular views of glittering waters. Guests will find themselves in paradise with this series of exquisite tropical sanctuaries, making it the perfect setting for an idyllic retreat. Within each villa, guests will discover living areas and bedrooms that open out to mini gardens, private timber sundecks and verandahs elegantly framing either lush greenery or an expanse of sea. Guests are assured of a superior slumber with goose feather pillows and luxe mattresses paired with 400 thread count Egyptian cotton bed linen, tastefully paired with a full complement of luxurious in-room amenities and bathrooms boasting rain showers and free-standing tubs coupled with an exclusive array of ESPA amenities and toiletries. Guests also get to enjoy complimentary day access to the facilities at Asia’s flagship spa – the world-renowned ESPA.",
        amenities = listOf(
            "Aircon", "Tv", "Coffee machine", "Kettle", "Hair dryer", "Iron", "Tub"
        ),
        images = PatagoniaImages(
            rooms = listOf(
                PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/2.jpg", description = "Double room"
                ), PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/4.jpg", description = "Bathroom"
                )
            ), amenities = listOf(
                PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/0.jpg", description = "RWS"
                ), PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/6.jpg", description = "Sentosa Gateway"
                )
            )
        )
    )

    val patagoniaHiltonShinjukuTokyo = PatagoniaHotel(
        id = "f8c9",
        destinationId = 1122,
        name = "Hilton Tokyo Shinjuku",
        latitude = "35.6926",
        longitude = "139.690965",
        address = null,
        description = null,
        amenities = null,
        images = PatagoniaImages(
            rooms = listOf(
                PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i10_m.jpg", description = "Suite"
                ), PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i11_m.jpg", description = "Suite - Living room"
                )
            ), amenities = listOf(
                PatagoniaImage(
                    url = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i57_m.jpg", description = "Bar"
                )
            )
        )
    )

    val hotelPatagoniaBeachVilla = Hotel(
        id = "iJhz",
        destinationId = 5432,
        name = "Beach Villas Singapore",
        location = Location(
            latitude = BigDecimal("1.264751"),
            longitude = BigDecimal("103.824006"),
            address = "8 Sentosa Gateway, Beach Villas, 098269",
            city = EMPTY_FALLBACK_STRING,
            country = EMPTY_FALLBACK_STRING,
        ),
        amenities = Amenities(
            general = emptyList(), room = listOf(
                "aircon", "tv", "coffee machine", "kettle", "hair dryer", "iron", "tub"
            )
        ),
        description = "Located at the western tip of Resorts World Sentosa, guests at the Beach Villas are guaranteed privacy while they enjoy spectacular views of glittering waters. Guests will find themselves in paradise with this series of exquisite tropical sanctuaries, making it the perfect setting for an idyllic retreat. Within each villa, guests will discover living areas and bedrooms that open out to mini gardens, private timber sundecks and verandahs elegantly framing either lush greenery or an expanse of sea. Guests are assured of a superior slumber with goose feather pillows and luxe mattresses paired with 400 thread count Egyptian cotton bed linen, tastefully paired with a full complement of luxurious in-room amenities and bathrooms boasting rain showers and free-standing tubs coupled with an exclusive array of ESPA amenities and toiletries. Guests also get to enjoy complimentary day access to the facilities at Asia’s flagship spa – the world-renowned ESPA.",
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/2.jpg", description = "Double room"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/4.jpg", description = "Bathroom"
                )
            ), sites = emptyList(), amenities = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/0.jpg", description = "RWS"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/6.jpg", description = "Sentosa Gateway"
                )
            )
        ),
        bookingConditions = emptyList()
    )

    val hotelPatagoniaHiltonShinjukuTokyo = Hotel(
        id = "f8c9", destinationId = 1122, name = "Hilton Tokyo Shinjuku", location = Location(
            latitude = BigDecimal("35.6926"),
            longitude = BigDecimal("139.690965"),
            address = EMPTY_FALLBACK_STRING,
            city = EMPTY_FALLBACK_STRING,
            country = EMPTY_FALLBACK_STRING,
        ), amenities = Amenities(
            general = emptyList(), room = emptyList()
        ), description = EMPTY_FALLBACK_STRING, images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i10_m.jpg", description = "Suite"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i11_m.jpg", description = "Suite - Living room"
                )
            ), sites = emptyList(), amenities = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i57_m.jpg", description = "Bar"
                )
            )
        ), bookingConditions = emptyList()
    )

    val paperFlyBeachVilla = PaperFlyHotel(
        id = "iJhz",
        destinationId = 5432,
        hotelName = "Beach Villas Singapore",
        location = PaperFlyLocation(
            address = "8 Sentosa Gateway, Beach Villas, 098269",
            country = "Singapore"
        ),
        description = "Surrounded by tropical gardens, these upscale villas in elegant Colonial-style buildings are part of the Resorts World Sentosa complex and a 2-minute walk from the Waterfront train station. Featuring sundecks and pool, garden or sea views, the plush 1- to 3-bedroom villas offer free Wi-Fi and flat-screens, as well as free-standing baths, minibars, and tea and coffeemaking facilities. Upgraded villas add private pools, fridges and microwaves; some have wine cellars. A 4-bedroom unit offers a kitchen and a living room. There's 24-hour room and butler service. Amenities include posh restaurant, plus an outdoor pool, a hot tub, and free parking.",
        amenities = PaperFlyAmenities(
            general = listOf(
                "outdoor pool", "indoor pool", "business center", "childcare"
            ), room = listOf(
                "tv", "coffee machine", "kettle", "hair dryer", "iron"
            )
        ),
        images = PaperFlyImages(
            rooms = listOf(
                PaperFlyImage(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/2.jpg", caption = "Double room"
                ),
                PaperFlyImage(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/3.jpg", caption = "Double room"
                )
            ), sites = listOf(
                PaperFlyImage(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/1.jpg", caption = "Front"
                )
            )
        ),
        bookingConditions = listOf(
            "All children are welcome. One child under 12 years stays free of charge when using existing beds. One child under 2 years stays free of charge in a child's cot/crib. One child under 4 years stays free of charge when using existing beds. One older child or adult is charged SGD 82.39 per person per night in an extra bed. The maximum number of children's cots/cribs in a room is 1. There is no capacity for extra beds in the room.",
            "Pets are not allowed.",
            "WiFi is available in all areas and is free of charge.",
            "Free private parking is possible on site (reservation is not needed).",
            "Guests are required to show a photo identification and credit card upon check-in. Please note that all Special Requests are subject to availability and additional charges may apply. Payment before arrival via bank transfer is required. The property will contact you after you book to provide instructions. Please note that the full amount of the reservation is due before arrival. Resorts World Sentosa will send a confirmation with detailed payment information. After full payment is taken, the property's details, including the address and where to collect keys, will be emailed to you. Bag checks will be conducted prior to entry to Adventure Cove Waterpark. === Upon check-in, guests will be provided with complimentary Sentosa Pass (monorail) to enjoy unlimited transportation between Sentosa Island and Harbour Front (VivoCity). === Prepayment for non refundable bookings will be charged by RWS Call Centre. === All guests can enjoy complimentary parking during their stay, limited to one exit from the hotel per day. === Room reservation charges will be charged upon check-in. Credit card provided upon reservation is for guarantee purpose. === For reservations made with inclusive breakfast, please note that breakfast is applicable only for number of adults paid in the room rate. Any children or additional adults are charged separately for breakfast and are to paid directly to the hotel."
        )
    )

    val hotelPaperFlyBeachVilla = Hotel(
        id = "iJhz",
        destinationId = 5432,
        name = "Beach Villas Singapore",
        location = Location(
            latitude = null,
            longitude = null,
            address = "8 Sentosa Gateway, Beach Villas, 098269",
            city = EMPTY_FALLBACK_STRING,
            country = "Singapore"
        ),
        description = "Surrounded by tropical gardens, these upscale villas in elegant Colonial-style buildings are part of the Resorts World Sentosa complex and a 2-minute walk from the Waterfront train station. Featuring sundecks and pool, garden or sea views, the plush 1- to 3-bedroom villas offer free Wi-Fi and flat-screens, as well as free-standing baths, minibars, and tea and coffeemaking facilities. Upgraded villas add private pools, fridges and microwaves; some have wine cellars. A 4-bedroom unit offers a kitchen and a living room. There's 24-hour room and butler service. Amenities include posh restaurant, plus an outdoor pool, a hot tub, and free parking.",
        amenities = Amenities(
            general = listOf(
                "outdoor pool", "indoor pool", "business center", "childcare"
            ), room = listOf(
                "tv", "coffee machine", "kettle", "hair dryer", "iron"
            )
        ),
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/2.jpg", description = "Double room"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/3.jpg", description = "Double room"
                )
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/1.jpg", description = "Front"
                )
            ), amenities = emptyList()
        ),
        bookingConditions = listOf(
            "All children are welcome. One child under 12 years stays free of charge when using existing beds. One child under 2 years stays free of charge in a child's cot/crib. One child under 4 years stays free of charge when using existing beds. One older child or adult is charged SGD 82.39 per person per night in an extra bed. The maximum number of children's cots/cribs in a room is 1. There is no capacity for extra beds in the room.",
            "Pets are not allowed.",
            "WiFi is available in all areas and is free of charge.",
            "Free private parking is possible on site (reservation is not needed).",
            "Guests are required to show a photo identification and credit card upon check-in. Please note that all Special Requests are subject to availability and additional charges may apply. Payment before arrival via bank transfer is required. The property will contact you after you book to provide instructions. Please note that the full amount of the reservation is due before arrival. Resorts World Sentosa will send a confirmation with detailed payment information. After full payment is taken, the property's details, including the address and where to collect keys, will be emailed to you. Bag checks will be conducted prior to entry to Adventure Cove Waterpark. === Upon check-in, guests will be provided with complimentary Sentosa Pass (monorail) to enjoy unlimited transportation between Sentosa Island and Harbour Front (VivoCity). === Prepayment for non refundable bookings will be charged by RWS Call Centre. === All guests can enjoy complimentary parking during their stay, limited to one exit from the hotel per day. === Room reservation charges will be charged upon check-in. Credit card provided upon reservation is for guarantee purpose. === For reservations made with inclusive breakfast, please note that breakfast is applicable only for number of adults paid in the room rate. Any children or additional adults are charged separately for breakfast and are to paid directly to the hotel."
        ),
    )

    val hotelBeachVilla = Hotel(
        id = "iJhz",
        destinationId = 5432,
        name = "Beach Villas Singapore",
        location = Location(
            latitude = BigDecimal("1.264751"),
            longitude = BigDecimal("103.824006"),
            address = "8 Sentosa Gateway, Beach Villas",
            city = "Singapore",
            country = "Singapore"
        ),
        description = "Located at the western tip of Resorts World Sentosa, guests at the Beach Villas are guaranteed privacy while they enjoy spectacular views of glittering waters. Guests will find themselves in paradise with this series of exquisite tropical sanctuaries, making it the perfect setting for an idyllic retreat. Within each villa, guests will discover living areas and bedrooms that open out to mini gardens, private timber sundecks and verandahs elegantly framing either lush greenery or an expanse of sea. Guests are assured of a superior slumber with goose feather pillows and luxe mattresses paired with 400 thread count Egyptian cotton bed linen, tastefully paired with a full complement of luxurious in-room amenities and bathrooms boasting rain showers and free-standing tubs coupled with an exclusive array of ESPA amenities and toiletries. Guests also get to enjoy complimentary day access to the facilities at Asia’s flagship spa – the world-renowned ESPA.",
        amenities = Amenities(
            general = listOf(
                "pool",
                "wi fi",
                "breakfast",
                "childcare",
                "indoor pool",
                "dry cleaning",
                "outdoor pool",
                "business center"
            ), room = listOf(
                "tv", "tub", "iron", "aircon", "kettle", "hair dryer", "coffee machine"
            )
        ),
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/2.jpg", description = "Double room"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/4.jpg", description = "Bathroom"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/3.jpg", description = "Double room"
                )
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/1.jpg", description = "Front"
                )
            ), amenities = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/0.jpg", description = "RWS"
                ),
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/0qZF/6.jpg", description = "Sentosa Gateway"
                )
            )
        ),
        bookingConditions = listOf(
            "All children are welcome. One child under 12 years stays free of charge when using existing beds. One child under 2 years stays free of charge in a child's cot/crib. One child under 4 years stays free of charge when using existing beds. One older child or adult is charged SGD 82.39 per person per night in an extra bed. The maximum number of children's cots/cribs in a room is 1. There is no capacity for extra beds in the room.",
            "Pets are not allowed.",
            "WiFi is available in all areas and is free of charge.",
            "Free private parking is possible on site (reservation is not needed).",
            "Guests are required to show a photo identification and credit card upon check-in. Please note that all Special Requests are subject to availability and additional charges may apply. Payment before arrival via bank transfer is required. The property will contact you after you book to provide instructions. Please note that the full amount of the reservation is due before arrival. Resorts World Sentosa will send a confirmation with detailed payment information. After full payment is taken, the property's details, including the address and where to collect keys, will be emailed to you. Bag checks will be conducted prior to entry to Adventure Cove Waterpark. === Upon check-in, guests will be provided with complimentary Sentosa Pass (monorail) to enjoy unlimited transportation between Sentosa Island and Harbour Front (VivoCity). === Prepayment for non refundable bookings will be charged by RWS Call Centre. === All guests can enjoy complimentary parking during their stay, limited to one exit from the hotel per day. === Room reservation charges will be charged upon check-in. Credit card provided upon reservation is for guarantee purpose. === For reservations made with inclusive breakfast, please note that breakfast is applicable only for number of adults paid in the room rate. Any children or additional adults are charged separately for breakfast and are to paid directly to the hotel."
        ),
    )

    val hotelPaperFlyInterContinental = Hotel(
        id = "SjyX",
        destinationId = 5432,
        name = "InterContinental",
        location = Location(
            latitude = null,
            longitude = null,
            address = "1 Nanson Rd, Singapore 238909",
            city = EMPTY_FALLBACK_STRING,
            country = "Singapore"
        ),
        amenities = Amenities(
            general = listOf(
                "outdoor pool",
                "business center",
                "childcare",
                "parking",
                "bar",
                "dry cleaning",
                "wifi",
                "breakfast",
                "concierge"
            ),
            room = listOf(
                "aircon",
                "minibar",
                "tv",
                "bathtub",
                "hair dryer"
            )
        ),
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i93_m.jpg", description = "Double room"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i94_m.jpg", description = "Bathroom"
                )
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i1_m.jpg", description = "Restaurant"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i2_m.jpg", description = "Hotel Exterior"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i5_m.jpg", description = "Entrance"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i24_m.jpg", description = "Bar"
                )
            ), amenities = emptyList()
        ),
        description = "InterContinental Singapore Robertson Quay is luxury's preferred address offering stylishly cosmopolitan riverside living for discerning travelers to Singapore. Prominently situated along the Singapore River, the 225-room inspiring luxury hotel is easily accessible to the Marina Bay Financial District, Central Business District, Orchard Road and Singapore Changi International Airport, all located a short drive away. The hotel features the latest in Club InterContinental design and service experience, and five dining options including Publico, an Italian landmark dining and entertainment destination by the waterfront.",
        bookingConditions = emptyList()
    )

    val hotelInterContinental = Hotel(
        id = "SjyX",
        destinationId = 5432,
        name = "InterContinental Singapore Robertson Quay",
        location = Location(
            latitude = null,
            longitude = null,
            address = "1 Nanson Road",
            city = "Singapore",
            country = "Singapore",
        ),
        amenities = Amenities(
            general = listOf(
                "bar",
                "pool",
                "wifi",
                "aircon",
                "parking",
                "bath tub",
                "breakfast",
                "childcare",
                "concierge",
                "dry cleaning",
                "outdoor pool",
                "business center"
            ),
            room = listOf(
                "tv", "aircon", "minibar", "bathtub", "hair dryer"
            )
        ),
        description = "InterContinental Singapore Robertson Quay is luxury's preferred address offering stylishly cosmopolitan riverside living for discerning travelers to Singapore. Prominently situated along the Singapore River, the 225-room inspiring luxury hotel is easily accessible to the Marina Bay Financial District, Central Business District, Orchard Road and Singapore Changi International Airport, all located a short drive away. The hotel features the latest in Club InterContinental design and service experience, and five dining options including Publico, an Italian landmark dining and entertainment destination by the waterfront.",
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i93_m.jpg", description = "Double room"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i94_m.jpg", description = "Bathroom"
                )
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i1_m.jpg", description = "Restaurant"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i2_m.jpg", description = "Hotel Exterior"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i5_m.jpg", description = "Entrance"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/Sjym/i24_m.jpg", description = "Bar"
                )
            ), amenities = emptyList()
        ),
        bookingConditions = emptyList()
    )
//
    val hotelPaperFlyHiltonShinjukuTokyo = Hotel(
        id = "f8c9",
        destinationId = 1122,
        name = "Hilton Tokyo",
        location = Location(
            latitude = null,
            longitude = null,
            address = "160-0023, SHINJUKU-KU, 6-6-2 NISHI-SHINJUKU, JAPAN",
            city = EMPTY_FALLBACK_STRING,
            country = "Japan"
        ),
        description = "This sleek high-rise property is 10 minutes' walk from Shinjuku train station, 6 minutes' walk from the Tokyo Metropolitan Government Building and 3 km from Yoyogi Park. The polished rooms offer Wi-Fi and flat-screen TVs, plus minibars, sitting areas, and tea and coffeemaking facilities. Suites add living rooms, and access to a club lounge serving breakfast and cocktails. A free shuttle to Shinjuku station is offered. There's a chic Chinese restaurant, a sushi bar, and a grill restaurant with an open kitchen, as well as an English pub and a hip cocktail lounge. Other amenities include a gym, rooftop tennis courts, and a spa with an indoor pool.",
        amenities = Amenities(
            general = listOf(
                "indoor pool",
                "business center",
                "wifi"
            ), room = listOf(
                "tv",
                "aircon",
                "minibar",
                "bathtub",
                "hair dryer"
            )
        ),
        images = Images(
            rooms = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i1_m.jpg", description = "Suite"
                ), Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i15_m.jpg", description = "Double room"
                )
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i55_m.jpg", description = "Bar"
                )
            ), amenities = emptyList()
        ),
        bookingConditions = listOf(
            "All children are welcome. One child under 6 years stays free of charge when using existing beds. There is no capacity for extra beds in the room.",
            "Pets are not allowed.",
            "Wired internet is available in the hotel rooms and charges are applicable. WiFi is available in the hotel rooms and charges are applicable.",
            "Private parking is possible on site (reservation is not needed) and costs JPY 1500 per day.",
            "When booking more than 9 rooms, different policies and additional supplements may apply.",
            "The hotel's free shuttle is offered from Bus Stop #21 in front of Keio Department Store at Shinjuku Station. It is available every 20-minutes from 08:20-21:40. The hotel's free shuttle is offered from the hotel to Shinjuku Train Station. It is available every 20-minutes from 08:12-21:52. For more details, please contact the hotel directly. At the Executive Lounge a smart casual dress code is strongly recommended. Attires mentioned below are strongly discouraged and may not permitted: - Night attire (slippers, Yukata robe, etc.) - Gym clothes/sportswear (Tank tops, shorts, etc.) - Beachwear (flip-flops, sandals, etc.) and visible tattoos. Please note that due to renovation works, the Executive Lounge will be closed from 03 January 2019 until late April 2019. During this period, guests may experience some noise or minor disturbances. Smoking preference is subject to availability and cannot be guaranteed."
        )
    )

    val hotelHiltonShinjukuTokyo = Hotel(
        id = "f8c9",
        destinationId = 1122,
        name = "Hilton Shinjuku Tokyo",
        location = Location(
            latitude = BigDecimal("35.6926"),
            longitude = BigDecimal("139.690965"),
            address = "160-0023, SHINJUKU-KU, 6-6-2 NISHI-SHINJUKU, JAPAN",
            city = "Tokyo",
            country = "Japan"),
        amenities = Amenities(
            general = listOf("bar", "pool", "wifi", "bath tub", "breakfast", "indoor pool", "dry cleaning", "business center"
            ), room = listOf("tv", "aircon", "minibar", "bathtub", "hair dryer")
        ),
        description = "This sleek high-rise property is 10 minutes' walk from Shinjuku train station, 6 minutes' walk from the Tokyo Metropolitan Government Building and 3 km from Yoyogi Park. The polished rooms offer Wi-Fi and flat-screen TVs, plus minibars, sitting areas, and tea and coffeemaking facilities. Suites add living rooms, and access to a club lounge serving breakfast and cocktails. A free shuttle to Shinjuku station is offered. There's a chic Chinese restaurant, a sushi bar, and a grill restaurant with an open kitchen, as well as an English pub and a hip cocktail lounge. Other amenities include a gym, rooftop tennis courts, and a spa with an indoor pool.",
        images = Images(
            rooms = listOf(
                Image(link="https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i10_m.jpg", description="Suite"), Image(link="https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i11_m.jpg", description="Suite - Living room"), Image(link="https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i1_m.jpg", description="Suite"), Image(link="https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i15_m.jpg", description="Double room")
            ), sites = listOf(
                Image(
                    link = "https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i55_m.jpg", description = "Bar"
                )
            ), amenities = listOf(Image(link="https://d2ey9sqrvkqdfs.cloudfront.net/YwAr/i57_m.jpg", description="Bar"))
        ),
        bookingConditions = listOf(
            "All children are welcome. One child under 6 years stays free of charge when using existing beds. There is no capacity for extra beds in the room.",
            "Pets are not allowed.",
            "Wired internet is available in the hotel rooms and charges are applicable. WiFi is available in the hotel rooms and charges are applicable.",
            "Private parking is possible on site (reservation is not needed) and costs JPY 1500 per day.",
            "When booking more than 9 rooms, different policies and additional supplements may apply.",
            "The hotel's free shuttle is offered from Bus Stop #21 in front of Keio Department Store at Shinjuku Station. It is available every 20-minutes from 08:20-21:40. The hotel's free shuttle is offered from the hotel to Shinjuku Train Station. It is available every 20-minutes from 08:12-21:52. For more details, please contact the hotel directly. At the Executive Lounge a smart casual dress code is strongly recommended. Attires mentioned below are strongly discouraged and may not permitted: - Night attire (slippers, Yukata robe, etc.) - Gym clothes/sportswear (Tank tops, shorts, etc.) - Beachwear (flip-flops, sandals, etc.) and visible tattoos. Please note that due to renovation works, the Executive Lounge will be closed from 03 January 2019 until late April 2019. During this period, guests may experience some noise or minor disturbances. Smoking preference is subject to availability and cannot be guaranteed."
        )
    )
}