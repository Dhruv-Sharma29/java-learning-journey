package com.learning.oops;

public class Car6 {
    String model;
    int year;
    Engine engine; // Composition

    Car6(String model, int year, String engineType) {
        this.model = model;
        this.year = year;

        // Engine is CREATED inside Car
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
