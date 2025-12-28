package com.learning.arrays;

import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * -------- Array Input Program --------
         * Takes user input to fill an array
         */

        // Declare array (size not yet defined)
        String[] foods;

        // Ask user for array size
        System.out.print("How many foods do you want?: ");
        int size = scanner.nextInt();

        // Consume leftover newline from nextInt()
        scanner.nextLine();

        // Create array with given size
        foods = new String[size];

        /*
         * Use a for loop to take input for each index
         */
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        /*
         * Enhanced for loop to display array elements
         */
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
