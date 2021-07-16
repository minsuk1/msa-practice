package com.example.catalogservice.controller;

import com.example.catalogservice.domain.CatalogEntity;
import com.example.catalogservice.service.CatalogServiceImpl;
import com.example.catalogservice.vo.ResponseCatalog;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog-service")
public class CatalogController {

    private final Environment env;
    private final CatalogServiceImpl catalogServiceImpl;

    @GetMapping("/health_check")
    public String status(){
        return String.format("it's working in user-service on PORT %s", env.getProperty("local.server.port"));
    }

    @GetMapping("/catalogs")
    public List<ResponseCatalog> getCatalogs() {
//        Iterable<CatalogEntity> catalogList = catalogService.getAllCatalogs();
//
//        List<ResponseCatalog> result = new ArrayList<>();
//        catalogList.forEach(v -> {
//            result.add(new ModelMapper().map(v, ResponseCatalog.class));
//        });

        return catalogServiceImpl.getAllCatalogs();
    }

}
