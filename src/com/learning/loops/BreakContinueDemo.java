package com.learning.loops;

public class BreakContinueDemo {
    public static void main(String[] args) {

        /*
         * break    → exits the loop completely (STOP)
         * continue → skips the current iteration (SKIP)
         */

        System.out.println("Break example:");

        for (int i = 0; i < 10; i++) {

            // When i becomes 5, exit the loop entirely
            if (i == 5) {
                break;   // loop stops here
            }

            System.out.println(i);
        }

        System.out.println("\nContinue example:");

        for (int i = 0; i < 10; i++) {

            // When i equals 5, skip only this iteration
            if (i == 5) {
                continue; // 5 is skipped
            }

            System.out.println(i);
        }
    }
}
