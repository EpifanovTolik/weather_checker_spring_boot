package com.andersen.service;


import com.andersen.dto.MessageDto;
import com.andersen.dto.PhoneCatalogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhoneCatalogApiService {

    @Autowired
    private RestTemplate restTemplate;

    //тут в валуе (из проперти) указываем url из первого модуля откуда взять json
    @Value("${constant.service.phone_service.api.url}")
    private String phoneCatalogServiceUrl;


    public String getCityByNumber(String number) {

        String finalUrl = phoneCatalogServiceUrl + "?number=" + number;

        //получить json и распарсить его на объект PhoneCatalogDto
        PhoneCatalogDto message = restTemplate.getForObject(finalUrl, PhoneCatalogDto.class);
        return message.getCity();
    }
}
