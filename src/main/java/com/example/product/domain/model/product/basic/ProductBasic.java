package com.example.product.domain.model.product.basic;

import com.example.product.domain.fundamentals.price.Tax;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductBasic {
    ProductCode code;
    ProductName name;
    ProductIntroduction introduction;
    ProductPrice price;

    public static ProductBasic create(String code, String name, String introduction, Integer price, Tax tax) {
        return new ProductBasic(
                new ProductCode(code),
                new ProductName(name),
                new ProductIntroduction(introduction),
                new ProductPrice(price, tax));
    }
}
