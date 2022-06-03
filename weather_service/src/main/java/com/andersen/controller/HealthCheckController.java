package com.andersen.controller;

import com.andersen.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/check")
    public String healthCheck(){
        return "Status OK";
    }

    @GetMapping("/check_dto")
    public MessageDto checkDto(){
        return new MessageDto("Some message", "34","+31232145");
    }
}
