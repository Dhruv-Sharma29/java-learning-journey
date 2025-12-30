package com.learning.oops;

public class Car3 {
    String make;
    String model;
    int year;
    String color;

    Car3(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /*
     * Overriding toString()
     * Returns a meaningful description of the object
     */
    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
