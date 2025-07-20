package com.example.springboot_lab7.repository;

import com.example.springboot_lab7.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        // Sample in-memory data
        products.add(new Product(1, "iPhone 15", 89999.0));
        products.add(new Product(2, "MacBook Pro", 149999.0));
        products.add(new Product(3, "AirPods Pro", 12999.0));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }
}
