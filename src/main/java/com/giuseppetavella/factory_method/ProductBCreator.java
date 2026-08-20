package com.giuseppetavella.factory_method;

public class ProductBCreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
