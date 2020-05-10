package com.example.product.domain.model.product.basic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductPriceCalculator {
    ProductPrice productPrice;

    Integer includeTax() {
        return productPrice.getValue() * ((productPrice.getTax().getValue() + 100) / 100);
    }
}
