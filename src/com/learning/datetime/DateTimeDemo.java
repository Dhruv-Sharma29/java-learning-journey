package com.learning.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {

        /*
         * ---------------- DATE & TIME IN JAVA ----------------
         *
         * Java 8 introduced the java.time package
         * which is IMMUTABLE, THREAD-SAFE, and more accurate
         *
         * Commonly used classes:
         * - LocalDate       → Date only (yyyy-MM-dd)
         * - LocalTime       → Time only (HH:mm:ss)
         * - LocalDateTime   → Date + Time
         * - Instant         → UTC timestamp (machine time)
         */

        /*
         * -------- Current Date & Time --------
         *
         * LocalDate date = LocalDate.now();
         * LocalTime time = LocalTime.now();
         * LocalDateTime dateTime = LocalDateTime.now();
         */

        /*
         * -------- UTC Time --------
         * Instant represents a moment on the timeline (UTC)
         *
         * Instant instant = Instant.now();
         */

        /*
         * -------- Custom Date-Time Format --------
         *
         * LocalDateTime dateTime = LocalDateTime.now();
         * DateTimeFormatter formatter =
         *     DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         *
         * String formattedDateTime = dateTime.format(formatter);
         * System.out.println(formattedDateTime);
         */

        /*
         * -------- Creating Custom Dates --------
         */

        // Create a specific date (yyyy, mm, dd)
        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println(date);

        // Create specific date & time
        LocalDateTime dateTime =
                LocalDateTime.of(2024, 12, 25, 12, 0, 0);

        LocalDateTime dateTime2 =
                LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        /*
         * -------- Comparing Date & Time --------
         *
         * isBefore()
         * isAfter()
         * equals()
         */

        if (dateTime.isBefore(dateTime2)) {
            System.out.println(dateTime + " is earlier than " + dateTime2);
        }
        else if (dateTime.isAfter(dateTime2)) {
            System.out.println(dateTime + " is later than " + dateTime2);
        }
        else if (dateTime.equals(dateTime2)) {
            System.out.println(dateTime + " is equal to " + dateTime2);
        }
    }
}
