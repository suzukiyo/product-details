package com.example.product.presentation.controller;

import com.example.product.application.usecase.ProductService;
import com.example.product.domain.fundamentals.price.Tax;
import com.example.product.domain.model.product.basic.ProductCode;
import com.example.product.infrastructure.datasource.product.ProductReadDao;
import com.example.product.infrastructure.datasource.product.entity.ProductEntity;
import com.example.product.presentation.viewmodel.ProductSaveView;
import com.example.product.presentation.viewmodel.ProductViewForDetailPage;
import com.example.product.presentation.viewmodel.ProductViewForSearchPage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class DemoController {

    ProductReadDao productReadDao;
    ProductService productService;

    @GetMapping
    String index(Model model) {

        ProductEntity productEntity = productReadDao.select(new ProductCode("12ABC345DEF"));
        Tax tax = new Tax(8); // datasource cache
        // for detail page
        model.addAttribute("productForDetailPage", ProductViewForDetailPage.create(productEntity, tax));
        // for search page
        model.addAttribute("productForSearchPage", ProductViewForSearchPage.create(productEntity, tax));

        return "/index";
    }

    @PostMapping
    void save(ProductSaveView view) {
        Tax tax = new Tax(8); // datasource cache
        productService.save(view.asProduct(tax));
    }
}
