package com.ascenda.hotels.data.config

import org.springframework.core.io.DefaultResourceLoader
import java.nio.charset.Charset

object ResourceLoader {
    private val loader = DefaultResourceLoader()
    fun loadAsString(location: String): String {
        return loader.getResource(location).getContentAsString(Charset.defaultCharset())
    }
}