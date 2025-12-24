package com.learning.basics;

public class VariablesDemo {
    public static void main(String[] args) {
        // ✅ variable = a reusable container for a value
        //               a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive    vs      Reference
        // ---------            ---------
        // int                  string
        // double               array
        // char                 object
        // boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. Declaration
        // 2. Assignment

        // int examples:
        System.out.println("\nint examples:");
        int age = 20;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println("Th year is " + year);
        System.out.println("Quantity:" + quantity);

        // double examples:
        System.out.println("\ndouble examples:");
        double price = 20.99;
        double price2 = 20;
        double cgpa = 8.5;
        double temperature = -12.5;

        System.out.println("$ " + price);
        System.out.println("$ " + price2);
        System.out.println("cgpa: " + cgpa);
        System.out.println("temperature: " + temperature);

        // char examples:
        System.out.println("\nchar examples:");
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
        System.out.println("Currency: " + currency);

        // boolean examples:
        boolean isStudent = true;   //camelCase
        /* In Java, camelCase is a naming convention where:
           The first word starts with a lowercase letter
           Every next word starts with an uppercase letter
           No spaces or underscores
         */
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
        /*
         It tends to be used more internally within a program,
         such as in if-statements.
         */

        // string example:
        System.out.println("\nstring examples:");
        String name = "Random";
        String food = "pizza";
        String email = "crimson@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("Your email is " + email);
        System.out.println("Your favourite food is " + food);
        System.out.println("Your favourite car is " + car);
        System.out.println("Your favourite color is " + color);
        System.out.println("Your choice is a " + color + " " + car);
    }
}
