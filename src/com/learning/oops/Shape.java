package com.learning.oops;

// abstract keyword is used
public abstract class Shape {
    /*
     * Abstract method
     * Must be implemented by child classes
     */
    abstract double area();

    /*
     * Concrete method
     * Inherited by all subclasses
     */
    void display() {
        System.out.println("This is a shape");
    }
}
