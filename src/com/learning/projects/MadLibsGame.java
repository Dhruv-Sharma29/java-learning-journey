package com.learning.projects;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nAt dawn, the " + adjective1 + " battlefield echoed with silence.");
        System.out.println("A lone samurai named " + noun1 + " stepped forward.");
        System.out.println("He was " + adjective2 + ", moving with precision, and kept " + verb1 + ".");
        System.out.println("The clash was " + adjective3 + " and unforgettable!");

        scanner.close();
    }
}
