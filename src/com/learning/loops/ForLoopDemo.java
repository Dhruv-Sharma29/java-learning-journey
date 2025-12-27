package com.learning.loops;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {

        /*
         * for loop → executes code a FIXED number of times
         * Best used when the number of iterations is known
         */

        /*
         * -------- for loop syntax --------
         * for (initialization; condition; update) {
         *     code to repeat
         * }
         */

        /*
        // Example 1: Basic for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */

        /*
        // Example 2: Loop based on user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();
        */

        /*
         * -------- Example 3: Countdown timer --------
         */

        /*
        Scanner scanner = new Scanner(System.in);

        // Read starting value for countdown
        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        // Loop runs from start down to 1
        for (int i = start; i > 0; i--) {
            System.out.println(i);

            // Pauses program for ~1 second between each iteration
            Thread.sleep(1000);
        }

        // Runs after loop completes
        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
        */
    }
}
