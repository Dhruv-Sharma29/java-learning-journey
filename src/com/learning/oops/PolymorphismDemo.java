package com.learning.oops;

public class PolymorphismDemo {
    public static void main(String[] args) {
        /*
         * Polymorphism →
         * "POLY"  = many
         * "MORPH" = forms
         *
         * Objects can be treated as objects of a common superclass
         * or interface.
         */

        Car4 car = new Car4();
        Bike bike = new Bike();
        Boat boat = new Boat();

        /*
         * -------- Polymorphism using ABSTRACTION --------
         */

        /*
        Vehicle[] vehicles = {
                car,
                bike,
                boat
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
         */

        /*
         * -------- Polymorphism using INTERFACE --------
         */
        VehicleUsingInterface[] vehicles = {
                car,
                bike,
                boat
        };

        for (VehicleUsingInterface vehicle : vehicles) {
            vehicle.go();
        }
    }
}
