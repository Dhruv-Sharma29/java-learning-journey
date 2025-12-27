package com.learning.loops;

import java.util.Scanner;

public class NestedLoopsDemo {
    public static void main(String[] args) {

        /*
         * nested loop → a loop inside another loop
         * Outer loop  → controls rows
         * Inner loop  → controls columns
         * Commonly used for matrices, patterns, and DS&A problems
         */

        /*
         * -------- Example 1: Basic nested loop --------
         * Prints numbers 1 to 9 for 3 rows
         */

        /*
        for (int i = 1; i <= 3; i++) {          // outer loop (rows)
            for (int j = 1; j <= 9; j++) {      // inner loop (columns)
                System.out.print(j + " ");
            }
            System.out.println();               // move to next row
        }
        */

        /*
         * -------- Example 2: Pattern printing --------
         */

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        // Take number of rows from user
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        // Take number of columns from user
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        // Take symbol to print
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        /*
         * Outer loop runs once per row
         * Inner loop runs once per column
         */

        for (int i = 0; i < rows; i++) {          // controls rows
            for (int j = 0; j < columns; j++) {   // controls columns
                System.out.print(symbol);
            }
            System.out.println();                 // new line after each row
        }

        scanner.close();
    }
}
