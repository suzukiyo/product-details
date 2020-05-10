package com.example.product.presentation.viewmodel;

import com.example.product.domain.fundamentals.price.Tax;
import com.example.product.domain.model.product.basic.ProductPrice;
import com.example.product.infrastructure.datasource.product.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductViewForDetailPage {
    String name;
    Integer priceExcludeTax;
    Integer priceIncludeTax;
    String introduction;

    public static ProductViewForDetailPage create(ProductEntity productEntity, Tax tax) {
        return new ProductViewForDetailPage(
                productEntity.getName(),
                productEntity.getPrice(),
                new ProductPrice(productEntity.getPrice(), tax).includeTax(),
                productEntity.getIntroduction());
    }
}
