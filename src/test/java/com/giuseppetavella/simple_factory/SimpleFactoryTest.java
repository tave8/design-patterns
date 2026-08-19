package com.giuseppetavella.simple_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleFactoryTest {
    @Test
    void instancesAreSameType() {
        Product productA = Products.getProduct(Products.A);
        Product productB = Products.getProduct(Products.B);

        assertTrue(productA instanceof Product);
        assertTrue(productB instanceof Product);
    }
    
}
