package com.giuseppetavella.factory_method;

public class ProductACreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
    
}
