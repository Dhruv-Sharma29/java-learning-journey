package com.learning.oops;

public class Car2 {

    // Attributes (instance variables)
    String model;
    String color;

    /*
     * Constructor
     * Initializes Car2 object
     */
    Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /*
     * Method defining object behavior
     */
    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
