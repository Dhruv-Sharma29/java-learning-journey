package com.learning.oops;

import java.util.Scanner;

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        /*
         * Runtime Polymorphism →
         * Method execution is decided at RUNTIME
         * based on the actual object type
         */

        Scanner scanner = new Scanner(System.in);

        // Parent reference
        Animal1 animal;

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog1();   // child object
            animal.speak();       // Dog1 version runs
        }
        else if (choice == 2) {
            animal = new Cat1();  // child object
            animal.speak();       // Cat1 version runs
        }
        else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
