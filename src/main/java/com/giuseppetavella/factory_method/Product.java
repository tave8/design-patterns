package com.giuseppetavella.factory_method;

public abstract class Product {
    private String label;


    public Product(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    protected void setLabel(String label) {
        this.label = label;
    }
}
 