package com.learning.basics;

import java.util.Random;

public class RandomNumbersDemo {
    public static void main (String[] args) {
        Random random = new Random();

        int number;
        double doubleNumber;
        boolean isHeads;

        number = random.nextInt(1,7);
        doubleNumber = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(doubleNumber);

        if(isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }

    }
}
