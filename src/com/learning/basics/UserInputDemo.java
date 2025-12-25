package com.learning.basics;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // To read a string variable
        String name = scanner.nextLine(); // Reads a character string, including spaces
        // next()
        // Reads only one word
        // Stops at whitespace (space, tab, newline)

        // To read an integer variable
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // To read a double variable
        System.out.print("Whats your cgpa: ");
        double cgpa = scanner.nextDouble();

        // To read a boolean variable
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your cgpa is " + cgpa);
        System.out.println("Student: " + isStudent);

        // Issue occurs due to leftover newline after reading an int or double
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // ✅ Solution: consume the leftover newline
        scanner.nextLine();

        System.out.print("Your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);


        scanner.close();
         */

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();
    }
}
