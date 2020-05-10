package com.example.product.application.usecase;

import com.example.product.domain.model.product.Product;
import com.example.product.domain.model.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class ProductService {

    ProductRepository databaseAdapter;

    public void save(Product product) {
        // validation & adjust

        // save
        databaseAdapter.save(product);
    }

}
