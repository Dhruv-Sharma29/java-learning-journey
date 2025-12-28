package com.learning.methods;

public class VarArgsDemo {
    public static void main(String[] args) {

        /*
         * varargs (...) → allows a method to accept
         * a variable number of arguments
         *
         * Java internally treats varargs as an array
         * Helps avoid writing multiple overloaded methods
         */

        System.out.println(add(1, 2, 3, 4, 5, 6));     // Sum of integers
        System.out.println(average(1, 2, 3, 4, 5, 6)); // Average of numbers
        System.out.println(average());                // No arguments
    }

    /*
     * Method using varargs (int...)
     * Accepts any number of int values
     */
    static int add(int... numbers) {

        int sum = 0;

        // Enhanced for loop over varargs array
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    /*
     * Method using varargs (double...)
     * Calculates average of numbers
     */
    static double average(double... numbers) {

        double sum = 0;

        // Handle case when no arguments are passed
        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
