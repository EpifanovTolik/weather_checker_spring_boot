package com.andersen.service;

import com.andersen.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ManagerService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PhoneCatalogApiService phoneService;

    @Autowired
    WeatherService weatherService;

    public MessageDto getWeatherByPhoneNumber(String numer){
        String city = phoneService.getCityByNumber(numer);
        String weather = weatherService.getWeatherByCity(city);
        MessageDto message = new MessageDto();
        message.setNumber(numer);
        message.setWeather(weather);
        message.setMessage("City - " + city);
        return message;


    }

}
