package com.example.product.infrastructure.datasource.product;

import com.example.product.infrastructure.datasource.product.entity.ProductEntity;
import com.example.product.domain.model.product.basic.ProductCode;
import org.seasar.doma.Dao;

import java.util.stream.Collector;

@Dao
public interface ProductReadDao {
    <R> R select(ProductCode productCode);
    <R> R selectList(ProductCode productCode, Collector<ProductEntity, ?, R> mapping);
}
