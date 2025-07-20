package com.example.springboot_lab7.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Smartphone", 499.99));
        products.add(new Product(3L, "Headphones", 199.99));
        System.out.println("ProductRepository initialized with 3 products.");
    }

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }
}
