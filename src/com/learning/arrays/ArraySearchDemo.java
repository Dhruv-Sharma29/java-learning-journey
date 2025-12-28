package com.learning.arrays;

import java.util.Scanner;

public class ArraySearchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * -------- Array Search Demo --------
         * Uses linear search to find an element in an array
         * Linear search → checks each element one by one
         */

        // Sample array
        String[] fruits = {"apple", "orange", "banana"};

        String target;           // Element to search for
        boolean isFound = false; // Flag to track search result

        // Take search input from user
        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        /*
         * Linear search using for loop
         */
        for (int i = 0; i < fruits.length; i++) {

            // Use equals() for String comparison
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break; // Stop searching once found
            }
        }

        // If element was not found
        if (!isFound) {
            System.out.println("Element not found in the array");
        }

        scanner.close();


    }
}
