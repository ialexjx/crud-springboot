package com.crud.service;

import com.crud.model.Product;
import com.crud.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public void saveAllProducts(List<Product> productList){
        productRepository.saveAll(productList);
    }

    public Product getProductById(int id){
       return productRepository.findById(id).orElse(null);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductByName(String productName){
        return productRepository.findProductByName(productName);
    }

    public Product updateProduct(Product product){
         Product existingProduct = productRepository.findById(product.getId()).orElse(null);
         existingProduct.setProductName(product.getProductName());
         existingProduct.setPrice(product.getPrice());
         existingProduct.setQuantity(product.getQuantity());
         return productRepository.save(existingProduct);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Deleted successfully";
    }
}
