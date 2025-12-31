package com.learning.oops;

public class InterfaceDemo {
    public static void main(String[] args) {

        /*
         * Interface →
         * A blueprint for a class
         * Contains abstract methods by default
         * Supports multiple inheritance-like behavior
         */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish = new Fish1();

        rabbit.flee();
        hawk.hunt();

        // Fish implements BOTH interfaces
        fish.flee();
        fish.hunt();
    }
}
