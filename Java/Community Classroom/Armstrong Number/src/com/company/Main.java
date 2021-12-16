package com.company;

// A number is a Armstrong number if the sum of the cube of the digits of the number is equal to the number itself
// The program outputs all the three digit armstrong number

public class Main {
    public static void main(String[] args) {
        System.out.println("All the three digit Armstrong numbers are: ");
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        return sum == original;
    }
}