package com.springframework5.spring5example.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class landingController {

    @RequestMapping(value="/home")
    public String getHome() {
        return "In Home";
    }

    @RequestMapping(value="/")
    public String defaultLanding() {
        return "Default Landing";
    }
}
