package com.learning.strings;

import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {

        /*
         * substring() → used to extract a portion of a string
         * Syntax:
         * substring(startIndex, endIndex) → endIndex is exclusive
         * substring(startIndex) → extracts till the end
         */

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        // Take email input from user
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        // Check if email contains '@' before extracting
        if (email.contains("@")) {

            // Extract username (before '@')
            username = email.substring(0, email.indexOf('@'));

            // Extract domain (after '@')
            domain = email.substring(email.indexOf('@') + 1);

            // Display results
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else {
            // Runs if '@' is not present
            System.out.println("Email must contain '@'");
        }

        scanner.close();
    }
}
