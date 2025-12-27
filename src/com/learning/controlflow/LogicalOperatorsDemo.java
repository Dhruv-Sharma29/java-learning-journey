package com.learning.controlflow;

import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        /*
         * -------- Logical Operators --------
         * &&  → AND  (all conditions must be true)
         * ||  → OR   (at least one condition must be true)
         * !   → NOT  (reverses the condition)
         */

        /*
         * -------- Example 1: Weather Check --------
         */

        /*
        double temp = 20;
        boolean isSunny = true;

        // AND (&&) and NOT (!) operators used together
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD 😄");
            System.out.println("It is SUNNY outside ☀️");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD 😄");
            System.out.println("It is CLOUDY outside ☁️");
        }
        // OR (||) operator
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad 😩");
        }
        */

        /*
         * -------- Example 2: Username Validation --------
         */

        Scanner scanner = new Scanner(System.in);

        // Username rules:
        // 1. Length must be between 4 and 12 characters
        // 2. Must NOT contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
