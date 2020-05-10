package com.example.product.domain.model.product;

import com.example.product.domain.model.product.basic.ProductBasic;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    ProductBasic basic;
}
