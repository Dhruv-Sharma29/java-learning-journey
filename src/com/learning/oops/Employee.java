package com.learning.oops;

public class Employee extends Person{
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last); // calls Person constructor
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
