package com.example.product.infrastructure.datasource.product;

import com.example.product.domain.model.product.Product;
import com.example.product.domain.model.product.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DatabaseAdapter implements ProductRepository {

    ProductWriteDao productWriteDao;

    @Override
    public void save(Product product) {
        // validation

        // save basic
        productWriteDao.insert(product.getBasic());

        // save xxxx
        // save yyyy
        // save zzzz
    }

}
