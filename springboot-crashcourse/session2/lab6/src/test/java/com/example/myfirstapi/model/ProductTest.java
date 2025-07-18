package com.example.myfirstapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testProductCreationWithoutId() {
        Product product = new Product("Laptop", 1200.0);
        assertEquals("Laptop", product.getName());
        assertEquals(1200.0, product.getPrice());
        assertNull(product.getId());
    }

    @Test
    void testProductCreationWithId() {
        Product product = new Product(1L, "Phone", 699.99);
        assertEquals(1L, product.getId());
        assertEquals("Phone", product.getName());
        assertEquals(699.99, product.getPrice());
    }

    @Test
    void testSetters() {
        Product product = new Product("TV", 300.0);
        product.setId(2L);
        product.setName("Smart TV");
        product.setPrice(450.0);

        assertEquals(2L, product.getId());
        assertEquals("Smart TV", product.getName());
        assertEquals(450.0, product.getPrice());
    }

    @Test
    void testEqualsAndHashCode() {
        Product p1 = new Product(1L, "Mouse", 25.0);
        Product p2 = new Product(1L, "Mouse", 25.0);

        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
