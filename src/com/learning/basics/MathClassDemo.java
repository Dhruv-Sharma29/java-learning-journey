package com.learning.basics;

import java.util.Scanner;

public class MathClassDemo {
    public static void main(String[] args) {

        /*
         * -------- Math Constants & Methods Demo --------
         * Math.PI → constant value of π (3.14159...)
         * Math.E  → Euler’s number (2.71828...)
         */

        /*
        double result;

        // Power function: base raised to exponent
        result = Math.pow(2, 3);           // 2³ = 8
        System.out.println(result);

        // Absolute value (removes negative sign)
        result = Math.abs(-5);             // 5
        System.out.println(result);

        // Square root
        result = Math.sqrt(144);           // 12
        System.out.println(result);

        // Rounds to nearest whole number
        result = Math.round(3.14);         // 3
        System.out.println(result);

        // Always rounds UP
        result = Math.ceil(3.14);          // 4
        System.out.println(result);

        // Always rounds DOWN
        result = Math.floor(3.99);         // 3
        System.out.println(result);

        // Returns the maximum value
        result = Math.max(10, 20);         // 20
        System.out.println(result);

        // Returns the minimum value
        result = Math.min(10, 20);         // 10
        System.out.println(result);
        */

        /*
         * -------- Hypotenuse Calculation --------
         * Formula: c = √(a² + b²)
         */

        /*
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        // Calculate hypotenuse using Pythagoras theorem
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + " cm");

        scanner.close();
        */

        /*
         * -------- Circle & Sphere Calculations --------
         * Circumference = 2πr
         * Area = πr²
         * Volume = (4/3)πr³
         */

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        // Read radius from user
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        // Perform calculations using Math class
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display results
        System.out.println("The circumference is: " + circumference + " cm");
        System.out.println("The area is: " + area + " cm²");
        System.out.println("The volume is: " + volume + " cm³");

        scanner.close();
    }
}
