package com.crud.controller;

import com.crud.model.Product;
import com.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CrudController {

    @Autowired
    ProductService productService;

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello, this is a Spring Boot example!";
    }

    @PostMapping("/addProduct")
    public void saveProduct(@RequestBody Product product){
         productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public void saveAllProducts(@RequestBody List<Product> productList){
        productService.saveAllProducts(productList);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/getProductByName")
    public List<Product> getProductByName(@RequestParam String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

//    @DeleteMapping("/deleteProduct/{id}")
//    public void deleteProduct(@PathVariable int id){
//        productService.deleteProductById(id);
//    }
}
