package com.learning.threading;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {
    public static void main(String[] args) {

        /*
         * ---------------- TIMER & TIMERTASK ----------------
         *
         * Timer →
         * - Schedules tasks to run at a specific time
         * - Can run tasks once or repeatedly
         *
         * TimerTask →
         * - Represents the task to be executed
         * - You must override the run() method
         *
         * Common use cases:
         * - Scheduled notifications
         * - Countdown timers
         * - Periodic background tasks
         */

        // Create a Timer object (scheduler)
        Timer timer = new Timer();

        /*
         * Anonymous TimerTask
         * - Executes code inside run()
         * - Runs on a background thread
         */
        TimerTask task = new TimerTask() {

            // Counter to control how many times task runs
            int count = 3;

            @Override
            public void run() {

                // Task logic
                System.out.println("Hello!");
                count--;

                /*
                 * Stop condition
                 * - Cancel timer once count reaches 0
                 */
                if (count <= 0) {
                    System.out.println("TASK COMPLETE!");
                    timer.cancel(); // stops the timer
                }
            }
        };

        /*
         * Schedule the task
         *
         * timer.schedule(task, delay, period)
         *
         * delay  → 0 ms (start immediately)
         * period → 1000 ms (run every 1 second)
         */
        timer.schedule(task, 0, 1000);
    }
}
