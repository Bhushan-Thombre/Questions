package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = sumDigit(n);
        System.out.println(ans);
    }

    static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigit(n / 10);
    }
}