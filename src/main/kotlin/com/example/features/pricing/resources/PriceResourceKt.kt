package com.example.features.pricing.resources

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.math.BigDecimal

@Controller("/price")
class PriceResourceKt {

    @Post
    fun calculatePrice(): BigDecimal {
        return BigDecimal.ZERO
    }
}