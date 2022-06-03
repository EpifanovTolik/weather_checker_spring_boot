package com.andersen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${constant.service.weather_service.api.url}")
    String weatherApiUrl;

    public String getWeatherByCity(String city) {
        String finalUrl = weatherApiUrl + "?city=" + city;
       return restTemplate.getForObject(finalUrl, String.class);

    }
}
