package com.learning.threading;

/*
 * Runnable implementation
 * Used to define task logic for a thread
 */
public class MyRunnable2 implements Runnable {

    // Each thread gets its own text
    private final String text;

    MyRunnable2(String text) {
        this.text = text;
    }

    /*
     * run() executes in a separate thread
     */
    @Override
    public void run() {

        /*
         * Loop runs 5 times
         * Thread sleeps for 1 second between prints
         */
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // pause thread
                System.out.println(text);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
