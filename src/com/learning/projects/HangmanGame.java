package com.learning.projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        /*
         * ---------------- JAVA HANGMAN GAME ----------------
         *
         * Concepts used:
         * - File handling (BufferedReader, FileReader)
         * - ArrayList
         * - Random class
         * - Loops & conditionals
         * - Methods
         * - Switch expressions
         * - Text blocks (ASCII art)
         */

        /*
         * File containing words (one word per line)
         * File should be located in project root or specified path
         */
        String filePath = "words.txt";

        /*
         * Read words from file and store in ArrayList
         */
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read file line-by-line
            while ((line = reader.readLine()) != null) {
                words.add(line.trim()); // remove extra spaces
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }

        /*
         * Select a random word from the list
         */
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        /*
         * wordState stores current guessed letters
         * '_' represents unguessed letters
         */
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        // Initialize wordState with underscores
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        // Game banner
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        /*
         * Main game loop
         * Player has max 10 wrong guesses
         */
        while (wrongGuesses < 10) {

            // Display hangman art
            System.out.println(getHangmanArt(wrongGuesses));

            // Display current word progress
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Take user guess
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            /*
             * Check if guessed letter exists in word
             */
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                // Reveal all matching letters
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                // Check win condition
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else {
                // Incorrect guess
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }

        /*
         * Loss condition
         */
        if (wrongGuesses >= 10) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    /*
     * Returns ASCII art based on number of wrong guesses
     */
    static String getHangmanArt(int wrongGuesses) {

        return switch (wrongGuesses) {

            case 0 -> """
                    
                    
                    
                    
                    
                    
                """;

            case 1 -> """
                    
                    
                    
                    
                    
                =========
                """;

            case 2 -> """
                     |
                     |
                     |
                     |
                     |
                =========
                """;

            case 3 -> """
                  +---+
                      |
                      |
                      |
                      |
                =========
                """;

            case 4 -> """
                  +---+
                  |   |
                      |
                      |
                      |
                =========
                """;

            case 5 -> """
                  +---+
                  |   |
                  O   |
                      |
                      |
                =========
                """;

            case 6 -> """
                  +---+
                  |   |
                  O   |
                  |   |
                      |
                =========
                """;

            case 7 -> """
                  +---+
                  |   |
                  O   |
                 /|   |
                      |
                =========
                """;

            // Backslash must be escaped in Java
            case 8 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                      |
                =========
                """;

            case 9 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 /    |
                =========
                """;

            case 10 -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                =========
                """;

            default -> """
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                =========
                """;
        };
    }
}