package com.andersen.controller;

import com.andersen.dto.PhoneCatalogDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/api/get_city")
    public PhoneCatalogDto getCityByNumber(@RequestParam String number) {
        return new PhoneCatalogDto("123", "Minsk");
    }
}
