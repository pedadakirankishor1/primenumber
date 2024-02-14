package com.basiccodes;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {
        int limit = 20; // Adjust the limit as needed

        System.out.println("Prime numbers up to " + limit + ":");
        IntStream.rangeClosed(2, limit)
                .filter(PrimeNumber::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.range(2, (int) Math.sqrt(number) + 1)
                        .noneMatch(i -> number % i == 0);
    }
}


