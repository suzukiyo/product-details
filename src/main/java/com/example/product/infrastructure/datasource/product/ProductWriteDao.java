package com.example.product.infrastructure.datasource.product;

import com.example.product.domain.model.product.basic.ProductBasic;
import org.seasar.doma.Dao;

@Dao
public interface ProductWriteDao {
    <R> R insert(ProductBasic productBasic);
}
