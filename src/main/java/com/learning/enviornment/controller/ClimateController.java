package com.learning.enviornment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
@RequestMapping(path = "/climate")
@Slf4j
public class ClimateController {

    @GetMapping(path = "/get/region")
    public String getClimateRegion() {
        // Get the default system time zone
        ZoneId currentZone = ZoneId.systemDefault();

        var APP_VERSION="v2";
        // Print the current zone
        System.out.println("Current time zone: " + currentZone);

        // If you want to display current time in the time zone
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("Current time: " + currentTime);

        //log.info("This is v2");

        return "AppVersion: "+APP_VERSION + "  "+currentZone +"   " +currentTime;
    }

}
