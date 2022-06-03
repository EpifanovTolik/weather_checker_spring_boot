package com.andersen.service;

import com.andersen.dto.WeatherApiResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Autowired
    RestTemplate restTemplate;
@Value("${constant.server.api.url}")
    String apiUrl;
    public String getWeatherByCity(String city) {
        String finalUrl = apiUrl + city;
       WeatherApiResponseDto responseDto =  restTemplate.getForObject(finalUrl, WeatherApiResponseDto.class);
       return responseDto.getTemp();
    }
}
