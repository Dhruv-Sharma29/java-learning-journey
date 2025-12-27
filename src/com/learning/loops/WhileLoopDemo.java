package com.learning.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {

        /*
         * while loop → repeats code
         * while the given condition remains true
         * Condition is checked BEFORE the loop runs
         */

        Scanner scanner = new Scanner(System.in);

        /*
         * -------- Example 1: Input validation --------
         * Loop runs until user enters a non-empty name
         */

        /*
        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // Runs only after valid input is entered
        System.out.println("Hello " + name);
        */

        /*
         * -------- Example 2: Infinite loop --------
         * Condition is always true, so loop never stops
         */

        /*
        while (1 == 1) {
            System.out.println("HELP! I'M STUCK IN A LOOP");
        }
        */

        /*
         * -------- Example 3: Game loop --------
         * Loop continues until user presses Q
         */

        /*
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        */

        /*
         * -------- Example 4: Age validation using while --------
         * Loop repeats while age is negative
         */

        /*
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");
        */

        /*
         * -------- Example 5: do-while loop --------
         * do-while runs AT LEAST once
         * Condition is checked AFTER the loop runs
         */

        /*
        int age;

        do {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");
        */

        /*
         * -------- Example 6: Number range validation --------
         * Ensures user enters a number between 1 and 10
         */

        int number;

        do {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
