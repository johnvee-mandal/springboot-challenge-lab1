package com.example.springboot_lab7.controller;

import com.example.springboot_lab7.model.Product;
import com.example.springboot_lab7.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // GET /products
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    // GET /products/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return productRepository.getProductById(id)
                .map(product -> ResponseEntity.ok(product))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
