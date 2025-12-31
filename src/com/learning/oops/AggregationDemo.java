package com.learning.oops;

public class AggregationDemo {
    public static void main(String[] args) {

        /*
         * Aggregation →
         * Represents a "has-a" relationship
         * One object contains another object as part of its structure.
         * Objects can exist independently
         */

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        // Library HAS books (aggregation)
        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
    }
}