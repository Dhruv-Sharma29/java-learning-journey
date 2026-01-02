package com.learning.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        /*
         * Exception →
         * An event that disrupts the normal flow of a program
         *
         * Common exceptions:
         * - InputMismatchException (wrong input type)
         * - ArithmeticException (divide by zero)
         *
         * try      → wrap risky code
         * catch    → handle exception
         * finally  → always executes
         */

        // try-with-resources → automatically closes Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter two numbers: ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            // Risky operation (division)
            System.out.println(number1 / number2);

        }
        // Handles invalid input (e.g., letters instead of numbers)
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        // Handles divide-by-zero
        catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        // Safety net for unexpected exceptions
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        // Always executes (cleanup / logging)
        finally {
            System.out.println("This always executes");
        }
    }
}
