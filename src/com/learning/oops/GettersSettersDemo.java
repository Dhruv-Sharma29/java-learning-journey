package com.learning.oops;

public class GettersSettersDemo {
    public static void main(String[] args) {

        /*
         * Getters & Setters →
         * Used to PROTECT object data (encapsulation)
         *
         * Getter → makes a field READABLE
         * Setter → makes a field WRITEABLE with rules
         */

        Car5 car = new Car5("Charger", "Yellow", 10000);

        // Using getters to read private data
        System.out.println(
                car.getColor() + " " +
                car.getModel() + " " +
                car.getPrice()
        );

        // Using setters to modify private data
        car.setColor("Blue");
        car.setPrice(15000);

        System.out.println(
                car.getColor() + " " +
                car.getModel() + " " +
                car.getPrice()
        );
    }
}
