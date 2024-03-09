package com.ascenda.hotels.data.functional

import com.ascenda.hotels.data.config.SupplierConfiguration
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class SupplierConfigurationTests: FunctionalTestBase() {
    @Autowired
    lateinit var supplierConfiguration: SupplierConfiguration

    @Test
    fun `should have correct supplier configuration`() {
        MatcherAssert.assertThat(supplierConfiguration.urlMap.size, Matchers.equalTo(3))
    }
}