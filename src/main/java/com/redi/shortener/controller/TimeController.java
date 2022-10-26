package com.redi.shortener.controller;

import com.redi.shortener.model.CreateTimeRequest;
import com.redi.shortener.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {
    @Autowired TimeService service;

    @GetMapping("/time")
    public static String dateAndTime(@RequestBody final CreateTimeRequest request){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
       // return Instant.now().toString();
    }
}
