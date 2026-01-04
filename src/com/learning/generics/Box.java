package com.learning.generics;

/*
 * Generic class
 *
 * T → Placeholder for any reference type
 */
public class Box<T> {

    T item;

    // Setter method
    public void setItem(T item) {
        this.item = item;
    }

    // Getter method
    public T getItem() {
        return this.item;
    }
}
