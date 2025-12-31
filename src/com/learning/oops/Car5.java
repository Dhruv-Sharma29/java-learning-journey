package com.learning.oops;

public class Car5 {

    /*
     * private → cannot be accessed outside this class
     * final   → value cannot be changed after initialization
     */
    private final String model; // read-only
    private String color;
    private int price;

    // Constructor
    Car5(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // -------- GETTERS (READ access) --------

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    // -------- SETTERS (WRITE access) --------

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be less than zero");
        } else {
            this.price = price;
        }
    }
}
