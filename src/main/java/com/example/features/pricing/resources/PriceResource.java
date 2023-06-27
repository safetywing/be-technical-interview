package com.example.features.pricing.resources;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.math.BigDecimal;

@Controller("/price")
public class PriceResource {

    @Get
    public BigDecimal calculatePrice() {
        return BigDecimal.ZERO;
    }


}
