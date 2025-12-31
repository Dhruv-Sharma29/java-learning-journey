package com.learning.oops;

/*
public class Car4 extends Vehicle{
    @Override
    void go() {
        System.out.println("The car is driving 🚗");
    }
}
 */

public class Car4 implements VehicleUsingInterface {
    @Override
    public void go() {
        System.out.println("The car is driving 🚗");
    }
}
