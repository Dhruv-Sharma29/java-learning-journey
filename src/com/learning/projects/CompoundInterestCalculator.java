package com.learning.projects;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        /*
         * -------- Compound Interest Calculator --------
         * Formula:
         * A = P (1 + r / n)^(n * t)
         *
         * P → principal amount
         * r → annual interest rate (decimal)
         * n → number of times interest is compounded per year
         * t → number of years
         */

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // Read principal amount
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        // Read annual interest rate and convert percentage to decimal
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        // Read number of times interest is compounded per year
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        // Read investment duration in years
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Calculate compound interest amount
        amount = principal * Math.pow(1 + rate / timesCompounded,
                timesCompounded * years);

        // Display final amount (rounded to 2 decimal places)
        System.out.printf("The amount after %d years is $%.2f\n", years, amount);

        scanner.close();
    }
}
