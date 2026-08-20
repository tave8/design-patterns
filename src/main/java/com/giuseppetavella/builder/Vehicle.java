package com.giuseppetavella.builder;

public abstract class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
    
}
