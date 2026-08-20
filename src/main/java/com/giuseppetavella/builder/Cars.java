package com.giuseppetavella.builder;

public class Cars {
    public static Car newRedWithModel(String model) {
        return new Car.Builder()
                .color("red")
                .model(model)
                .build();
    }
}
