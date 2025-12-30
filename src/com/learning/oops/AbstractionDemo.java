package com.learning.oops;

public class AbstractionDemo {
    public static void main(String[] args) {

        /*
         * Abstraction →
         * Hides implementation details
         * Shows only essential features
         *
         * Abstract classes:
         * - Cannot be instantiated
         * - Can have abstract & concrete methods
         */

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 9);
        Rectangle rectangle = new Rectangle(6, 7);

        // Calling overridden methods
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
