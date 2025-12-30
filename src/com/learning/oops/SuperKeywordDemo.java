package com.learning.oops;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        // super → represents the parent class
        //         used to call parent constructors and overridden methods
        //         ensures proper parent initialization


        Person person = new Person("Tom", "Riddle");
        Student1 student1 = new Student1("Harry", "Potter", 3.45);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();

        student1.showName();
        student1.showGPA();

        employee.showName();
        employee.showSalary();
    }
}
