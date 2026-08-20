package com.giuseppetavella.factory_method;

public abstract class ProductCreator {

    public Product improveLabel() {
        Product product = createProduct();
        // additional processing...
        product.setLabel(product.getLabel() + "-improved");
        return product;
    }
    
    /**
     * Factory method.
     * 
     * @return
     */
    public abstract Product createProduct();
}
