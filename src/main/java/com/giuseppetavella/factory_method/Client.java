package com.giuseppetavella.factory_method;

public class Client {
    static void main(String[] args) {
        improveLabel(new ProductACreator());
        improveLabel(new ProductBCreator());
    }
    
    
    static void improveLabel(ProductCreator productCreator) {
        Product product = productCreator.improveLabel();
        System.out.println(product.getLabel());
    }
}
