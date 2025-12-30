package com.learning.oops;

public class Fish extends Animal{

    /*
     * @Override annotation:
     * - Ensures this method actually overrides a parent method
     * - Causes a compile-time error if method signature is wrong
     * - Helps prevent bugs
     */

    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
