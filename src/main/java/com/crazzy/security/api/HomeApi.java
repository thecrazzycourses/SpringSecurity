package com.crazzy.security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {

    @GetMapping
    public String getHome() {
        return "App is up and healthy";
    }
}
