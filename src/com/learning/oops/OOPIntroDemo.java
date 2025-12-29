package com.learning.oops;

public class OOPIntroDemo {
    public static void main(String[] args) {

        /*
         * Object → an entity that:
         * - holds data (attributes / variables)
         * - performs actions (methods / functions)
         * - is a reference data type
         */

        // Creating objects of the Car class
        Car car1 = new Car();
        Car car2 = new Car();

        /*
         * Each object has its OWN copy of attributes
         */

        // Changing an attribute of car1
        car1.isRunning = true;

        /*
         * Accessing object attributes using dot (.) operator
         */
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        /*
         * Calling object methods
         */
        car1.start();
        System.out.println(car1.isRunning);

        car1.stop();
        System.out.println(car1.isRunning);

        car1.drive();
        car1.brake();

        /*
         * Objects can have same values but are DIFFERENT instances
         */
        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
    }
}
