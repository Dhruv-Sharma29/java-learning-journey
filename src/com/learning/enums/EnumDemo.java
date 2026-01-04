package com.learning.enums;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {

        /*
         * ---------------- ENUMS IN JAVA ----------------
         *
         * Enum (Enumeration) →
         * - Special type of class
         * - Represents a FIXED set of constants
         * - Improves readability & safety
         * - Faster and safer than using Strings
         *
         * Common uses:
         * - Days of week
         * - Directions
         * - Status codes
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {

            /*
             * valueOf(String)
             * - Converts a String into an Enum constant
             * - Throws IllegalArgumentException if invalid
             */
            Day day = Day.valueOf(response);

            /*
             * Enums work very efficiently with switch statements
             */
            switch (day) {

                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY ->
                        System.out.println("It is a weekday");

                case SATURDAY,
                     SUNDAY ->
                        System.out.println("It is the weekend");
            }
        }
        /*
         * Handles invalid enum input
         */
        catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }

        scanner.close();
    }
}
