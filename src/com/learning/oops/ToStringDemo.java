package com.learning.oops;

public class ToStringDemo {
    public static void main(String[] args) {

        /*
         * toString() →
         * Method inherited from Object class
         * Returns a String representation of an object
         *
         * Default output: className@hashcode
         * Can be overridden to return meaningful data
         */

        Car3 car1 = new Car3("Ford", "Mustang", 2025, "Red");
        Car3 car2 = new Car3("Chevrolet", "Corvette", 2025, "Blue");

        // println automatically calls toString()
        System.out.println(car1);
        System.out.println(car2);
    }
}
