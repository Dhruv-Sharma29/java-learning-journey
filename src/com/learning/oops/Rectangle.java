package com.learning.oops;

public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    @Override
    double area() {
        return length * width;
    }
}
