package com.learning.threading;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {

        /*
         * ---------------- COUNTDOWN TIMER ----------------
         *
         * Uses:
         * - Scanner → take user input
         * - Timer → schedules repeated execution
         * - TimerTask → defines the task logic
         *
         * Program behavior:
         * - Counts down every second
         * - Stops automatically when count reaches 0
         */

        // Take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        // Create Timer (scheduler)
        Timer timer = new Timer();

        /*
         * Anonymous TimerTask
         * - run() executes every 1 second
         * - Uses response as starting value
         */
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {

                // Display current count
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        /*
         * Schedule task at fixed rate
         *
         * scheduleAtFixedRate(task, delay, period)
         *
         * delay  → 0 ms (start immediately)
         * period → 1000 ms (1 second interval)
         */
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
