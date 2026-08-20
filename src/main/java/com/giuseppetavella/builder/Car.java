package com.giuseppetavella.builder;

public class Car extends Vehicle {
    
    private String model;

    public Car(Builder builder) {
        super(builder.color);
        setModel(builder.model);
    }
    

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public static class Builder {
        private String model;
        private String color;

        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
        
    }
}
