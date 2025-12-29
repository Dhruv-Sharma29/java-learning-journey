package com.learning.oops;

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {

        /*
         * -------- Array of Objects --------
         * An array that stores OBJECTS instead of primitive values
         * Each element refers to an object in memory
         */

        /*
         * -------- Method 1 (commented) --------
         * Create objects first, then store them in an array
         *
         * Car2 car1 = new Car2("Mustang", "Red");
         * Car2 car2 = new Car2("Corvette", "Blue");
         * Car2 car3 = new Car2("Charger", "Yellow");
         *
         * Car2[] cars = {car1, car2, car3};
         */

        /*
         * -------- Method 2 (Anonymous Objects) --------
         * Objects are created directly inside the array
         * No separate variable name (anonymous object)
         */

        Car2[] cars = {
                new Car2("Mustang", "Red"),
                new Car2("Corvette", "Blue"),
                new Car2("Charger", "Yellow")
        };

        /*
         * -------- Traversing array (enhanced for loop) --------
         * Calling drive() for each object
         */
        for (Car2 car : cars) {
            car.drive();
        }

        /*
         * -------- Modifying object properties --------
         * Changes affect the actual objects in memory
         */
        for (Car2 car : cars) {
            car.color = "Black";
        }

        /*
         * -------- Verifying changes --------
         */
        for (Car2 car : cars) {
            car.drive();
        }
    }
}
