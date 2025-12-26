package com.learning.controlflow;

import java.util.Scanner;

public class EnhancedSwitchDemo {
    public static void main(String[] args) {

        /*
         * Enhanced switch → cleaner replacement for multiple else-if statements
         * Introduced in Java 14
         * Uses arrow syntax (->) instead of break statements
         */

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        /*
         * Multiple case labels can be combined
         * Arrow (->) automatically ends the case (no break needed)
         */

        switch (day) {

            // Grouping multiple cases with same output
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> System.out.println("It is a weekday 😩");

            case "Saturday", "Sunday"
                    -> System.out.println("It is the weekend 😄");

            // Runs when input does not match any case
            default
                    -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
