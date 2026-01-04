package com.learning.threading;

public class MultithreadingDemo {
    public static void main(String[] args) {

        /*
         * ---------------- MULTITHREADING IN JAVA ----------------
         *
         * Multithreading allows multiple threads to run concurrently.
         *
         * Thread →
         * - A separate path of execution
         * - Runs independently of other threads
         *
         * Benefits:
         * - Better CPU utilization
         * - Faster execution of tasks
         * - Background processing
         */

        /*
         * Creating threads using Runnable implementation
         * Each thread runs the same class with different data
         */
        Thread thread1 = new Thread(new MyRunnable2("PING"));
        Thread thread2 = new Thread(new MyRunnable2("PONG"));

        System.out.println("GAME START!");

        /*
         * start() creates new threads
         * JVM schedules them independently
         */
        thread1.start();
        thread2.start();

        /*
         * join()
         * - Makes the main thread wait
         * - Ensures both threads finish before continuing
         */
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        // Executes only after both threads complete
        System.out.println("GAME OVER!");
    }
}
