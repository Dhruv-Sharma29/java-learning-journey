package com.learning.oops;

public class WrapperClassesDemo {
    public static void main(String[] args) {

        /*
         * Wrapper Classes →
         * Allow primitive types to be used as objects
         *
         * Primitive → Wrapper
         * int       → Integer
         * double    → Double
         * char      → Character
         * boolean   → Boolean
         *
         * Needed for:
         * - Collections Framework
         * - Utility methods
         * - Object-based APIs
         */

        /*
         * -------- Manual Boxing (Deprecated) --------
         * Avoid using constructors directly
         *
         * Integer a = new Integer(123);
         * Double b = new Double(3.14);
         * Character c = new Character('$');
         * Boolean d = new Boolean(true);
         */

        /*
         * -------- Autoboxing --------
         * Java automatically converts primitives to wrapper objects
         */
        /*
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        // -------- Unboxing --------
        int p = a;
        double q = b;
        char r = c;
        boolean s = d;
        */

        /*
         * -------- Primitive → String --------
         */
        /*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(true);

        String x = a + b + c + d;
        System.out.println(x);
        */

        /*
         * -------- String → Primitive --------
         */
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");

        // char has no parse method → use charAt()
        char c = "Pizza".charAt(0);

        boolean d = Boolean.parseBoolean("true");

        /*
         * -------- Character Utility Methods --------
         */
        char letter = 'l';

        // Check if character is a letter
        System.out.println(Character.isLetter(letter));

        // Check if character is uppercase
        System.out.println(Character.isUpperCase(letter));
    }
}
