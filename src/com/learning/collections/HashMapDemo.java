package com.learning.collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        /*
         * ---------------- HASHMAP IN JAVA ----------------
         *
         * HashMap stores data in key-value pairs
         *
         * Key:
         * - Must be UNIQUE
         * - Cannot be duplicated
         *
         * Value:
         * - Can be duplicated
         *
         * Characteristics:
         * - Does NOT maintain insertion order
         * - Fast access (O(1) average)
         * - Allows ONE null key and multiple null values
         *
         * Syntax:
         * HashMap<KeyType, ValueType>
         */

        // Create a HashMap
        HashMap<String, Double> map = new HashMap<>();

        /*
         * put(key, value)
         * - Adds a key-value pair
         * - If key already exists, value is overwritten
         */
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        // Print entire map
        System.out.println(map);

        /*
         * remove(key)
         * - Removes the key-value pair
         */
        map.remove("apple");

        /*
         * get(key)
         * - Returns value associated with key
         */
        System.out.println(map.get("orange"));

        /*
         * containsKey(key)
         * - Checks if key exists
         */
        System.out.println(map.containsKey("banana")); // true
        System.out.println(map.containsKey("apple"));  // false

        /*
         * Safe way to access a value
         */
        if (map.containsKey("banana")) {
            System.out.println(map.get("banana"));
        }
        else {
            System.out.println("Key not found");
        }

        /*
         * containsValue(value)
         * - Checks if any key maps to this value
         */
        System.out.println(map.containsValue(1.00));

        /*
         * size()
         * - Returns number of key-value pairs
         */
        System.out.println(map.size());

        /*
         * Iterating through HashMap
         * keySet() → returns all keys
         */
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
