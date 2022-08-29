package com.company;

import java.util.Scanner;
// The program will output false if the number entered in not prime and if the number entered is prime than the program will output true
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n) {
        if (n < 1) {
            return false;
        }else if (n == 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}