package com.example.product.infrastructure.datasource.product.entity;

import lombok.Value;

/**
 * Productの腐敗防止層
 */
@Value
public class ProductEntity {
    String name;
    Integer price;
    String introduction;
}
