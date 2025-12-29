package com.learning.oops;

public class Student {

    // -------- Attributes (Instance Variables) --------
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    /*
     * -------- Constructor --------
     * Same name as class
     * Used to initialize object values
     *
     * Parameters do NOT have to match attribute names,
     * but commonly they do (best practice)
     */
    Student(String name, int age, double gpa) {

        /*
         * this keyword → refers to the current object
         * Used to differentiate instance variables
         * from constructor parameters
         */
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    /*
     * -------- Method --------
     * Defines behavior of Student object
     */
    void study() {
        // Added space after name for clean output
        System.out.println(this.name + " is studying");
    }
}