package com.learning.threading;

public class AnonymousClassDemo {
    public static void main(String[] args) {

        /*
         * ---------------- ANONYMOUS CLASS ----------------
         *
         * Anonymous Class →
         * - A class without a name
         * - Created at the moment it is needed
         * - Cannot be reused
         *
         * Common use cases:
         * - One-time behavior changes
         * - Event handling
         * - Runnable / Thread
         * - Callbacks
         */

        // Normal object of Dog class
        Dog dog1 = new Dog();

        /*
         * Anonymous class
         *
         * - Overrides methods of Dog
         * - Adds custom behavior only for this object
         * - No separate class file is created
         */
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Ruh-roh!*");
            }
        };

        // Calls original Dog method
        dog1.speak();

        // Calls overridden method in anonymous class
        dog2.speak();
    }
}
