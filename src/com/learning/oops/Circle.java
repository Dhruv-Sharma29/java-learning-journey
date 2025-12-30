package com.learning.oops;

public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }


}
