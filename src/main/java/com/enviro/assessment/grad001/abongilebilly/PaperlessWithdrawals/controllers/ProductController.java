package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll()
    {

        return productService.getAll();
    }

    @PostMapping("/products")
    public Product addProduct(
            @RequestBody Product product
    )
    {
        return productService.addProduct(product);
    }
}
