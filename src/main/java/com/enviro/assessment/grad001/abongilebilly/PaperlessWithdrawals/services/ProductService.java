package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAll()
    {
        return productRepository.findAll();
    }

    public Product addProduct(Product product)
    {


        return productRepository.save(product);
    }
}
