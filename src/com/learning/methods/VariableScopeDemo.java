package com.learning.methods;

public class VariableScopeDemo {

    static int x = 3; // CLASS (global) variable

    public static void main(String[] args) {

        /*
         * variable scope → determines where a variable can be accessed
         *
         * Priority:
         * Local scope > Class scope
         */

        int x = 1; // LOCAL variable (shadows class variable)

        doSomething();  // calls method

        // Refers to local variable x = 1
        System.out.println(x);
    }

    static void doSomething() {

        int x = 2; // LOCAL variable inside method

        // Refers to local variable x = 2
        System.out.println(x);
    }
}
