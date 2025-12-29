package com.learning.oops;

public class Friend {

    /*
     * Static variable
     * Shared by all Friend objects
     */
    static int numOfFriends;

    // Instance variable (unique per object)
    String name;

    /*
     * Constructor
     * Increments static variable each time
     * a new object is created
     */
    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    /*
     * Static method
     * Can access ONLY static variables directly
     */
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends");
    }
}
