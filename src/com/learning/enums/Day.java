package com.learning.enums;

/*
 * Enum with fields, constructor, and methods
 *
 * Each enum constant is an OBJECT
 */
public enum Day {

    // Enum constants with associated values
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    /*
     * Instance variable
     * Each enum constant stores its own day number
     */
    private final int dayNumber;

    /*
     * Enum constructor
     * - Always private by default
     * - Called automatically for each constant
     */
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    /*
     * Getter method
     */
    public int getDayNumber() {
        return this.dayNumber;
    }
}
