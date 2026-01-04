package com.learning.generics;

/*
 * Generic class with two type parameters
 *
 * T → Item type
 * U → Price type
 */
public class Product<T, U> {

    T item;
    U price;

    // Constructor using generic types
    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    // Getter for item
    public T getItem() {
        return this.item;
    }

    // Getter for price
    public U getPrice() {
        return this.price;
    }
}
