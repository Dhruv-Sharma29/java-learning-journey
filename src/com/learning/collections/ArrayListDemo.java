package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        /*
         * ArrayList →
         * - A resizable array (dynamic size)
         * - Stores OBJECTS only (uses autoboxing for primitives)
         * - Part of Java Collections Framework
         *
         * Array vs ArrayList:
         * Array      → fixed size
         * ArrayList  → dynamic size
         */

        // -------- ArrayList of Integers --------
        ArrayList<Integer> intList = new ArrayList<>();

        // add elements
        intList.add(3);
        intList.add(1);
        intList.add(2);

        System.out.println(intList);

        // -------- ArrayList of Doubles --------
        ArrayList<Double> doubleList = new ArrayList<>();

        doubleList.add(3.14);
        doubleList.add(1.99);
        doubleList.add(2.01);

        System.out.println(doubleList);

        // -------- ArrayList of Strings --------
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        // remove element at index
        fruits.remove(0); // removes "Apple"

        // replace element at index
        fruits.set(0, "Pineapple");

        // get element at index
        System.out.println(fruits.get(0));

        // size of ArrayList
        System.out.println(fruits.size());

        // sort ArrayList alphabetically
        Collections.sort(fruits);

        System.out.println(fruits);

        // traverse using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // -------- User Input with ArrayList --------
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food number " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
