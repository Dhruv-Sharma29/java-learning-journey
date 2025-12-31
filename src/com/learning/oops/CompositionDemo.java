package com.learning.oops;

public class CompositionDemo {
    public static void main(String[] args) {

        /*
         * Composition →
         * Represents a strong "part-of" relationship
         * Child object CANNOT exist without parent
         *
         * Example:
         * Car HAS an Engine
         */

        Car6 car = new Car6("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
