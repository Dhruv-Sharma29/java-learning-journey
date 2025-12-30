package com.learning.oops;

public class MethodOverridingDemo {
    public static void main(String[] args) {

        /*
         * Method Overriding →
         * When a subclass provides its own implementation
         * of a method already defined in the parent class
         */

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Fish fish = new Fish();

        /*
         * The overridden method in the CHILD class
         * is called instead of the parent version
         * (Runtime Polymorphism)
         */

        dog1.move();
        cat1.move();
        fish.move();
    }
}
