package com.example.catalogservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog-service")
public class CatalogController {

    private final Environment env;

    @GetMapping("/health_check")
    public String status(){
        return String.format("it's working in user-service on PORT %s", env.getProperty("local.server.port"));
    }

}
