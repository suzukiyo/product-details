package com.example.product.domain.model.product.basic;

import com.example.product.domain.fundamentals.price.Tax;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductPrice {
    Integer value;
    Tax tax;

    public Integer includeTax() {
        return new ProductPriceCalculator(this).includeTax();
    }
}
