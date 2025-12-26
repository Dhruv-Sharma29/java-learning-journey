package com.learning.projects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        /*
         * -------- TEMPERATURE CONVERTER PROGRAM --------
         * Converts temperature between Celsius and Fahrenheit
         */

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        /*
         * Ternary Operator Syntax:
         * (condition) ? valueIfTrue : valueIfFalse
         *
         * If unit is "C":
         *     Convert Fahrenheit → Celsius
         *     Formula: (F - 32) × 5 / 9
         *
         * Else:
         *     Convert Celsius → Fahrenheit
         *     Formula: (C × 9 / 5) + 32
         */

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("Converted Temperature: %.2f°%s", newTemp, unit);

        scanner.close();
    }
}
