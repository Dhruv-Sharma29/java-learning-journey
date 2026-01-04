package com.learning.generics;

public class GenericsDemo {
    public static void main(String[] args) {

        /*
         * ---------------- GENERICS IN JAVA ----------------
         *
         * Generics allow you to write reusable code
         * that works with different data types.
         *
         * <T>  → Type parameter (placeholder)
         * <E>  → Element
         * <K>  → Key
         * <V>  → Value
         *
         * Benefits:
         * - Type safety
         * - No casting required
         * - Reusable code
         */

        // Box that stores String type
        Box<String> stringBox = new Box<>();
        stringBox.setItem("banana");
        System.out.println(stringBox.getItem());

        // Box that stores Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(3);
        System.out.println(integerBox.getItem());

        /*
         * Generic class with TWO type parameters
         * T → item type
         * U → price type
         */
        Product<String, Double> product1 =
                new Product<>("apple", 0.50);

        Product<String, Integer> product2 =
                new Product<>("ticket", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
