package com.example.catalogservice.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {
    List<CatalogEntity> findByProductId(String productId);

    @Query("SELECT c FROM CatalogEntity c ORDER BY c.id DESC")
    List<CatalogEntity> findAllDesc();
}