package com.learning.projects;

import java.util.Scanner;

public class BankingProgram {

    // Shared Scanner object (accessible by all methods)
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * -------- JAVA BANKING PROGRAM --------
         * Features:
         * 1. Show Balance
         * 2. Deposit Money
         * 3. Withdraw Money
         * 4. Exit Program
         */

        double balance = 0;
        boolean isRunning = true;
        int choice;

        // Main program loop (menu-driven)
        while (isRunning) {

            System.out.println("********************");
            System.out.println("BANKING PROGRAM ");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            /*
             * Enhanced switch statement
             * Each option calls a specific method
             */

            switch (choice) {
                case 1 -> showBalance(balance);          // Show balance
                case 2 -> balance += deposit();          // Add deposit amount
                case 3 -> balance -= withdraw(balance);  // Subtract withdrawn amount
                case 4 -> isRunning = false;             // Exit program
                default -> System.out.println("Invalid choice!");
            }
        }

        System.out.println("*****************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("*****************************");

        scanner.close();
    }

    /*
     * -------- Show Balance --------
     * Displays current balance
     */
    static void showBalance(double balance) {
        System.out.println("********************");
        System.out.printf("$%.2f\n", balance);
    }

    /*
     * -------- Deposit Money --------
     * Returns amount to be added to balance
     */
    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    /*
     * -------- Withdraw Money --------
     * Returns amount to be deducted from balance
     */
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
        }
        else {
            return amount;
        }

        return 0;
    }
}
