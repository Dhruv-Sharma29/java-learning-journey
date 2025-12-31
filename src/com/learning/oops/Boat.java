package com.learning.oops;

/*
public class Boat extends Vehicle{
    @Override
    void go() {
        System.out.println("The boat is sailing 🚤");
    }
}
 */

public class Boat implements VehicleUsingInterface {
    @Override
    public void go() {
        System.out.println("The boat is sailing 🚤");
    }
}

