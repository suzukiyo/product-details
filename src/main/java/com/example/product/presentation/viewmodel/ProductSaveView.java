package com.example.product.presentation.viewmodel;

import com.example.product.domain.fundamentals.price.Tax;
import com.example.product.domain.model.product.Product;
import com.example.product.domain.model.product.basic.ProductBasic;

public class ProductSaveView {
    String code;
    String name;
    String introduction;
    Integer price;

    public Product asProduct(Tax tax) {
        ProductBasic productBasic = ProductBasic.create(code, name, introduction, price, tax);
        return new Product(productBasic);
    }
}
