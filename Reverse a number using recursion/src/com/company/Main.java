package com.company;

public class Main {

    // Method 1
    static int sum = 0;
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = (sum * 10) + rem;
        rev1(n / 10);
    }

    // Method 2
    private static int rev2(int n) {
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(1234));
    }
}
