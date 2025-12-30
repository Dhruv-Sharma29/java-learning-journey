package com.learning.oops;

public class InheritanceDemo {
    public static void main(String[] args) {

        /*
         * Inheritance →
         * Child class inherits properties & methods
         * from parent class
         * Grandparent -> Parent -> Child
         * Organism → Animal → Dog / Cat
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.speak();

        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.speak();

        System.out.println(plant.isAlive);
        plant.Photosynthesis();
    }
}
