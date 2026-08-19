package com.giuseppetavella.simple_factory;

public class Products {

    public static final int A = 0;
    public static final int B = 1;
    
    public static Product getProduct(int product) {
        if(product == A) {
            return new ProductA();
        }
        if(product == B) {
            return new ProductB();
        }
        throw new IllegalArgumentException("input product does not exist");
    }
    
}
