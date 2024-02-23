package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.ProductDto;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers.ProductMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    ProductMapper mapper = new ProductMapper();
    public List<ProductDto> getAll()
    {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map((product)->mapper.mapToProductDto(product))
                .collect(Collectors.toList());

    }

    public ProductDto addProduct(ProductDto productDto)
    {
        Product product = mapper.mapsToProduct(productDto);
        productRepository.save(product);


        return productDto;
    }
}
