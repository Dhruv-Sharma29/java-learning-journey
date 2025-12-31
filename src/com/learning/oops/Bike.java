package com.learning.oops;

/*
public class Bike extends Vehicle{
    @Override
    void go() {
        System.out.println("The bike is riding 🚲");
    }
}
 */

public class Bike implements VehicleUsingInterface {
    @Override
    public void go() {
        System.out.println("The bike is riding 🚲");
    }
}
