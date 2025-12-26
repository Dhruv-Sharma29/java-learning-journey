package com.learning.controlflow;

public class TernaryOperatorDemo {
    public static void main(String[] args) {

        /*
         * Ternary Operator (? :)
         * Used as a shorthand for if-else
         *
         * Syntax:
         * variable = (condition) ? valueIfTrue : valueIfFalse;
         */

        // Example 1: Pass or Fail based on score
        int score = 70;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // Example 2: Check if a number is even or odd
        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // Example 3: Determine time of day
        int hours = 9;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        // Example 4: Assign tax rate based on income
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
