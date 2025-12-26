package com.learning.controlflow;

public class NestedIfDemo {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        // Outer if checks the first condition (student or not)
        if (isStudent) {
            // Inner if runs ONLY if isStudent is true
            if (isSenior) {
                // Both conditions are true (student + senior)
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;   // Apply combined discount
            }
            // Inner else runs if isStudent is true but isSenior is false
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;   // Apply student discount
            }

        }
        // Outer else runs when isStudent is false
        else {
            // Inner if checks senior status when not a student
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;   // Apply senior discount
            }
            // Inner else runs when neither condition is true
            else {
                price *= 1;     // No discount applied
            }
        }

        // Final output after all nested if checks
        System.out.printf("The price of a ticket is: $%.2f\n", price);
    }
}
