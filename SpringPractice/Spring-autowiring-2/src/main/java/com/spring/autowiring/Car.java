package com.spring.autowiring;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car() {
        System.out.println("CAR Zero param CONSTRUCTOR");
    }

    
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public void setEngine(Engine engine)
    {
    	this.engine=engine;
    }

    public void start() {
        System.out.println("Car is starting with " + engine.getType() + " engine.");
    }
}