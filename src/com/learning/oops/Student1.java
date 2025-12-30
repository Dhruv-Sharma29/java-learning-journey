package com.learning.oops;

public class Student1 extends Person{
    double gpa;


    /*
     * ❌ ERROR: Parent class has no default constructor.
    * Java implicitly calls super(), which does not exist.
    * Use super(first, last) to initialize parent fields.
    */

    /*
    Student(String first, String last, double gpa) {
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }
     */

    Student1(String first, String last, double gpa) {
        super(first, last); // calls Person constructor
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
