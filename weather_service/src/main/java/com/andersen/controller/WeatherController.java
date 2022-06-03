package com.andersen.controller;

import com.andersen.dto.MessageDto;
import com.andersen.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    ManagerService managerService;

    @GetMapping("/get_weather")
    public MessageDto getWeather(@RequestParam String number) {
        return managerService.getWeatherByPhoneNumber(number);
    }


}
