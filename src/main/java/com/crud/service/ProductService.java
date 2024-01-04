package com.crud.service;

import com.crud.model.Product;
import com.crud.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(){
        productRepository.save(new Product());
    }
}
