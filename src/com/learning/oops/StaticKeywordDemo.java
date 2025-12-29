package com.learning.oops;

public class StaticKeywordDemo {
    public static void main(String[] args) {

        /*
         * static →
         * Makes a variable or method belong to the CLASS
         * instead of individual objects
         *
         * Shared across all objects
         */

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        /*
         * Static variables should be accessed using
         * the CLASS name, not object name
         */
        System.out.println(Friend.numOfFriends);

        /*
         * Static methods can be called
         * without creating an object
         */
        Friend.showFriends();

        /*
         * Example:
         * Math.round() is a static utility method
         * No Math object is required
         */
        Math.round(3.99);
    }
}
