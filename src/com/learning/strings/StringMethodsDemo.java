package com.learning.strings;

public class StringMethodsDemo {
    public static void main(String[] args) {

        String name = "Dark Kernel";

        /*
         * -------- String Information Methods --------
         */

        // length() → returns number of characters in the string
        int length = name.length();          // 11

        // charAt(index) → returns character at given index
        char letter = name.charAt(0);        // 'D'

        // indexOf() → returns index of first occurrence
        int index = name.indexOf("e");       // index of first 'e'

        // lastIndexOf() → returns index of last occurrence
        int lastIndex = name.lastIndexOf("e");

        /*
         * -------- String Case Methods --------
         */

        // toUpperCase() → converts string to uppercase
        name = name.toUpperCase();           // "DARK KERNEL"

        // toLowerCase() → converts string to lowercase
        name = name.toLowerCase();           // "dark kernel"

        /*
         * -------- String Cleanup Methods --------
         */

        // trim() → removes leading and trailing spaces
        name = name.trim();

        // replace(old, new) → replaces characters or words
        name = name.replace("e", "o");

        /*
         * -------- String Validation --------
         */

        // isEmpty() → checks if string is empty ("")
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        /*
         * -------- Searching in String --------
         */

        // contains() → checks if string contains given sequence
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name doesn't contain any spaces");
        }

        /*
         * -------- Comparing Strings --------
         */

        // equals() → checks exact match (case-sensitive)
        // equalsIgnoreCase() → ignores case sensitivity
        if (name.equals("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
