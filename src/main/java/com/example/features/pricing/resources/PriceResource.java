package com.example.features.pricing.resources;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.math.BigDecimal;

@Controller("/price")
public class PriceResource {

    @Post
    public BigDecimal calculatePrice() {
        return BigDecimal.ZERO;
    }


}
