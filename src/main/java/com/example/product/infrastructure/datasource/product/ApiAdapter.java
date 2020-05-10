
package com.example.product.infrastructure.datasource.product;

import com.example.product.domain.model.product.Product;
import com.example.product.domain.model.product.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ApiAdapter implements ProductRepository {

    @Override
    public void save(Product product) {
        // save
    }

}
