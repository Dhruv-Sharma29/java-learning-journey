package com.learning.methods;

public class MethodsDemo {
    public static void main(String[] args) {

        /*
         * method → a block of reusable code
         * executed only when it is called
         *
         * D.R.Y → Don't Repeat Yourself
         */

        /*
         * -------- Method with parameters --------
         */

        /*
        String name = "DS";
        int age = 25;

        // Order and data type of arguments must match parameters
        happyBirthday(name, age);
        */

        /*
         * -------- Methods with return values --------
         */

        // square() returns a double
        System.out.println(square(3));

        // cube() returns a double
        System.out.println(cube(3));

        /*
         * -------- Method returning String --------
         */

        String fullName = getFullName("Dark", "Kernel");
        System.out.println(fullName);

        /*
         * -------- Method returning boolean --------
         */

        int age = 21;

        // ageCheck() returns true or false
        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up");
        }
    }

    /*
     * Method with parameters and no return value
     */
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    /*
     * Method returning a double
     */
    static double square(double number) {
        return number * number;
    }

    /*
     * Method returning a double
     */
    static double cube(double number) {
        return number * number * number;
    }

    /*
     * Method returning a String
     */
    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    /*
     * Method returning a boolean
     */
    static boolean ageCheck(int age) {
        // Returns true if age is 18 or above
        return age >= 18;
    }
}
