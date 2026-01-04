package com.learning.projects;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockApp {
    public static void main(String[] args) {

        /*
         * ---------------- JAVA ALARM CLOCK ----------------
         *
         * Concepts used:
         * - LocalTime & DateTimeFormatter
         * - Exception handling
         * - Multithreading (Runnable)
         * - Audio playback (.wav)
         */

        Scanner scanner = new Scanner(System.in);

        /*
         * Formatter for time input
         * HH → 24-hour format
         * mm → minutes
         * ss → seconds
         */
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        // Path to alarm sound file
        String filePath = "music/On The Flip Alarm.wav";

        // UI Banner
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓                                      ▓\n" +
                        "▓            CONSOLE ALARM             ▓\n" +
                        "▓                CLOCK                 ▓\n" +
                        "▓                                      ▓\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n"
        );

        /*
         * Loop until valid alarm time is entered
         */
        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                // Parse user input into LocalTime
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);

            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        /*
         * Create a separate thread for the alarm
         * Main thread remains free
         */
        Thread alarmThread =
                new Thread(new AlarmClock(alarmTime, filePath, scanner));

        alarmThread.start();
    }
}
