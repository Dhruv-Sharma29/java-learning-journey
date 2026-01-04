package com.learning.threading;

/*
 * Runnable implementation
 *
 * - Defines task logic for a thread
 * - run() executes in a separate thread
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {

        /*
         * Countdown logic
         * Sleeps for 1 second in each iteration
         */
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // pause thread for 1 second
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            /*
             * Stop program after 10 seconds
             */
            if (i == 10) {
                System.out.println("Time's up!");
                System.exit(0); // terminates JVM
            }
        }
    }
}
