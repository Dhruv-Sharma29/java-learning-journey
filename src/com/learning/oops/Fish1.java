package com.learning.oops;

public class Fish1 implements Prey, Predator {

    @Override
    public void flee() {
        System.out.println("The fish is fleeing 🐟");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting 🐟");
    }
}
