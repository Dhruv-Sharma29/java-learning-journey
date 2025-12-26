package com.learning.projects;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        /*
         * -------- WEIGHT CONVERSION PROGRAM --------
         * Pseudocode:
         * 1. Declare required variables
         * 2. Display a welcome message
         * 3. Ask the user to choose a conversion type
         * 4. If choice = 1, convert pounds (lbs) to kilograms (kg)
         * 5. Else if choice = 2, convert kilograms (kg) to pounds (lbs)
         * 6. Else, display an invalid choice message
         */

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        } 
        else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else {
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
