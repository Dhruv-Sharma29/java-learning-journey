package com.learning.arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {


        /*
         * 2D array → an array where each element is itself an array
         * Useful for storing data in rows and columns (matrix-like)
         */

        /*
         * -------- Alternative approach --------
         * Create separate 1D arrays and combine them
         *
         * String[] fruits = {"apple", "orange", "banana"};
         * String[] vegetables = {"potato", "onion", "carrot"};
         * String[] dairyProduct = {"milk", "butter", "cheese", "yogurt"};
         *
         * String[][] groceries = {fruits, vegetables, dairyProduct};
         */

        /*
         * =================================================
         * 2D ARRAY EXAMPLE 1: GROCERIES
         * =================================================
         * 2D array → an array where each element is itself an array
         * Useful for storing data in rows and columns
         */

        String[][] groceries = {
                {"apple", "orange", "banana"},           // fruits
                {"potato", "onion", "carrot"},           // vegetables
                {"milk", "butter", "cheese", "yogurt"}   // dairy products
        };

        // Modifying elements using row & column index
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][3] = "cream";

        // Traversing groceries 2D array
        System.out.println("Groceries List:");
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * =================================================
         * 2D ARRAY EXAMPLE 2: TELEPHONE KEYPAD
         * =================================================
         * char 2D array used to represent a keypad layout
         */

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        // Traversing telephone keypad
        System.out.println("Telephone Keypad:");
        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
