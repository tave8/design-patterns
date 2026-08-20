package com.giuseppetavella.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTest {
    @Test
    void whenSetWithBuilderThenInstanceHasSameValues() {
        var color = "green";
        var model = "volkswagen";
        
        Car.Builder builder = new Car.Builder();
        builder.color(color).model(model);
        
        Car car = new Car(builder);

        assertEquals(color, car.getColor());
        assertEquals(model, car.getModel());
    } 
    
    @Test
    void whenCreateWithBuilderAndFactoryThenSame() {
        String model = "alfa romeo";
        Car carFromFactory = Cars.newRedWithModel(model);
        Car carFromBuilder = new Car.Builder()
                .color("red")
                .model(model)
                .build();

        assertEquals(model, carFromFactory.getModel());
        assertEquals(model, carFromBuilder.getModel());
    }
}
