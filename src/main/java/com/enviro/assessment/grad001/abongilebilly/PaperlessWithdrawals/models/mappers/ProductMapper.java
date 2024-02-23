package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.ProductDto;

public class ProductMapper {

    public ProductDto mapToProductDto(Product product)
    {
        ProductDto productDto = new ProductDto();
        productDto.setCurrentBalance(product.getCurrentBalance());
        productDto.setInvestmentName(product.getInvestmentName());
        productDto.setInvestmentType(product.getInvestmentType());
        productDto.setInvestorId(product.getInvestor().getId());
        return productDto;
    }

    public Product mapsToProduct(ProductDto productDto)
    {
        Product product = new Product();
        product.setCurrentBalance(productDto.getCurrentBalance());
        product.setInvestmentType(productDto.getInvestmentType());
        product.setInvestmentName(product.getInvestmentName());
        Investor investor = new Investor();
        investor.setId(productDto.getInvestorId());
        product.setInvestor(investor);
        return product;

    }


}
