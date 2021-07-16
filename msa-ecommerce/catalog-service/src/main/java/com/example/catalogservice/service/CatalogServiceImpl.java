package com.example.catalogservice.service;

import com.example.catalogservice.domain.CatalogEntity;
import com.example.catalogservice.domain.CatalogRepository;
import com.example.catalogservice.vo.ResponseCatalog;
import lombok.RequiredArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl{

    private final CatalogRepository catalogRepository;

    public List<ResponseCatalog> getAllCatalogs() {
        return catalogRepository.findAllDesc().stream()
                .map(ResponseCatalog::new) //map(posts -> new PostsListResponseDto(posts)
                .collect(Collectors.toList());
    }
}