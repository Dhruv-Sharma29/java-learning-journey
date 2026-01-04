package com.learning.threading;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
         * ---------------- THREADING IN JAVA ----------------
         *
         * Threading allows multiple tasks to run simultaneously.
         *
         * Benefits:
         * - Better performance
         * - Responsive applications
         * - Background task execution
         *
         * Common use cases:
         * - File I/O
         * - Network operations
         * - Timers & animations
         */

        /*
         * Ways to create a thread:
         *
         * 1️⃣ Extend Thread class (simpler, less flexible)
         * 2️⃣ Implement Runnable interface (recommended)
         */

        Scanner scanner = new Scanner(System.in);

        /*
         * Create Runnable object
         */
        MyRunnable myRunnable = new MyRunnable();

        /*
         * Pass Runnable to Thread constructor
         */
        Thread thread = new Thread(myRunnable);

        /*
         * Daemon thread:
         * - Runs in background
         * - Automatically stops when main thread ends
         */
        thread.setDaemon(true);

        /*
         * Start the thread
         * JVM calls run() internally
         */
        thread.start();

        /*
         * Main thread execution
         */
        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
