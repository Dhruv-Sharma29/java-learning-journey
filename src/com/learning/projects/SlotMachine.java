package com.learning.projects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        /*
         * -------- JAVA SLOT MACHINE GAME --------
         * Features:
         * - Betting system
         * - Random slot symbols
         * - Payout logic
         * - Play-again loop
         */

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Game header
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println(" Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");

        while (balance > 0) {

            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS\n");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0\n");
                continue;
            }

            balance -= bet;

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry, you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Your final balance is $" + balance);

        scanner.close();
    }

    /*
     * -------- Spin Slot Row --------
     * Randomly selects 3 symbols
     */
    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    /*
     * -------- Print Slot Row --------
     */
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    /*
     * -------- Payout Logic --------
     */
    static int getPayout(String[] row, int bet) {

        // All three symbols match (JACKPOT)
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        // Two adjacent symbols match
        else if (row[0].equals(row[1]) || row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        // No match
        return 0;
    }
}
