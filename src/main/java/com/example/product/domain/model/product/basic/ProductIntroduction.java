package com.example.product.domain.model.product.basic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ProductIntroduction {
    String value;

    String asShortIntroduction() {
        return value.substring(0, 100);
    }
}
