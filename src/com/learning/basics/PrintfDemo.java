package com.learning.basics;

public class PrintfDemo {
    public static void main(String[] args) {

        /*
         * printf() → used to format output
         * Syntax:
         * %[flags][width][.precision][specifier-character]
         */

        String name = "Nightwing";
        char firstLetter = 'N';
        int age = 24;
        double height = 179.5;
        boolean isEmployed = true;

        /*
         * -------- Basic Format Specifiers --------
         */

        System.out.printf("Hello %s\n", name);            // %s → String
        System.out.printf("Your name starts with a %c\n", firstLetter); // %c → char
        System.out.printf("You are %d years old\n", age); // %d → integer
        System.out.printf("You are %f cm tall\n", height); // %f → floating-point
        System.out.printf("Employed: %b\n", isEmployed);  // %b → boolean

        // Multiple values in a single printf
        System.out.printf("%s is %d years old\n", name, age);

        /*
         * -------- Precision --------
         * Controls number of digits after decimal point
         */

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;

        System.out.printf("%.1f\n", price1);  // 1 decimal place
        System.out.printf("%.2f\n", price2);  // 2 decimal places
        System.out.printf("%.3f\n", price3);  // 3 decimal places

        /*
         * -------- Flags --------
         */

        // + → always shows sign (+ or -)
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.3f\n", price2);
        System.out.printf("%+.3f\n", price3);

        // , → comma as grouping separator
        System.out.printf("%,.2f\n", price4);
        System.out.printf("%,.3f\n", price5);
        System.out.printf("%,.3f\n", price6);

        // ( → encloses negative numbers in parentheses
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.3f\n", price2);
        System.out.printf("%(.3f\n", price3);

        // space → leading space for positive, minus for negative
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .3f\n", price2);
        System.out.printf("% .3f\n", price3);

        /*
         * -------- Width --------
         * Controls spacing and alignment
         */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 789;

        // 0 → zero padding
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // number → right-justified padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // negative number → left-justified padding
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
