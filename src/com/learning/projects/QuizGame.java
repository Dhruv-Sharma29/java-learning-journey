package com.learning.projects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * -------- ROCK PAPER SCISSORS GAME --------
         * A classic console-based game
         * Player competes against the computer
         * Uses random choices and conditional logic
         */

        String[] questions = {
                "What keyword is used to define a class in Java?",
                "Which loop runs at least once even if the condition is false?",
                "Which operator is used for AND in Java?",
                "What is the index of the first element in an array?",
                "What is method overloading?"
        };

        String[][] options = {
                {"1. function", "2. class", "3. define", "4. object"},
                {"1. for", "2. while", "3. do-while", "4. foreach"},
                {"1. &", "2. &&", "3. ||", "4. !"},
                {"1. 1", "2. -1", "3. 0", "4. Depends on array"},
                {
                        "1. Same method name, same parameters",
                        "2. Same method name, different parameters",
                        "3. Different method name, same parameters",
                        "4. Nested methods"
                }
        };

        int[] answers = {1, 2, 1, 2, 1};

        int score = 0;
        int guess;

        // Welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        /*
         * Main quiz loop
         * Each iteration displays one question and its options
         */
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            System.out.println();

            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }

        System.out.println(
                "Your final score is: " + score + " out of " + questions.length
        );

        scanner.close();
    }
}
