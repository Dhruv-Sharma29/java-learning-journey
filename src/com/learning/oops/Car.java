package com.learning.oops;

public class Car {

    /*
     * -------- Attributes (Instance Variables) --------
     * Define the state of the object
     */

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    /*
     * -------- Methods --------
     * Define the behavior of the object
     */

    void start() {
        System.out.println("You start the engine");
        isRunning = true;
    }

    void stop() {
        System.out.println("You stop the engine");
        isRunning = false;
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }
}
