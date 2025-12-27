package com.learning.methods;

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        /*
         * -------- Method Overloading --------
         * Overloaded methods:
         * → share the same method name
         * → have different parameter lists
         *
         * Method signature = method name + parameters
         * (return type alone does NOT overload a method)
         */

        // Overloaded add() methods
        System.out.println(add(1, 2));        // calls add(double, double)
        System.out.println(add(1, 2, 3));     // calls add(double, double, double)

        /*
         * Overloaded bakePizza() methods
         */

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

        pizza = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza);

        pizza = bakePizza("flat bread", "mozzarella", "black olives");
        System.out.println(pizza);
    }

    /*
     * Overloaded add() methods
     */

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    /*
     * Overloaded bakePizza() methods
     */

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
