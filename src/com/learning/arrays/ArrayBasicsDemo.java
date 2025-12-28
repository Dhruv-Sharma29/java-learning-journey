package com.learning.arrays;

import java.util.Arrays;

public class ArrayBasicsDemo {
    public static void main(String[] args) {

        /*
         * array → a collection of values of the same data type
         * Think of it as a single variable that can store multiple values
         * Indexing starts from 0
         */

        // Declare and initialize an array
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // Modify an element using index
        fruits[0] = "pineapple";

        // length → number of elements in the array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        /*
         * -------- Accessing elements --------
         */

        // System.out.println(fruits[0]);
        // System.out.println(fruits[1]);

        /*
         * -------- Traditional for loop --------
         * Best when index is needed
         */

        /*
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        */

        /*
         * -------- Enhanced for loop (for-each) --------
         * Cleaner and easier when index is not required
         */

        /*
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        */

        /*
         * -------- Sorting an array --------
         * Arrays.sort() sorts elements in ascending order
         */

        /*
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        */

        /*
         * -------- Filling an array --------
         * Arrays.fill() replaces ALL elements with a single value
         */

        Arrays.fill(fruits, "pineapple");

        // Print array after fill
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
