package com.example.catalogservice.vo;

import com.example.catalogservice.domain.CatalogEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Getter
public class ResponseCatalog {
    private String productId;
    private String productName;
    private Integer unitPrice;
    private Integer stock;
    private Date createdAt;

    public ResponseCatalog(CatalogEntity entity) {
        this.productId = entity.getProductId();
        this.productName = entity.getProductName();
        this.unitPrice = entity.getUnitPrice();
        this.stock = entity.getStock();
        this.createdAt = entity.getCreatedAt();
    }
}