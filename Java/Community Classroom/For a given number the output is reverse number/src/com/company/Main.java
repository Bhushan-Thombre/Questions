package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum = 0;
        int n = input.nextInt();
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum * 10 + rem;
        }
        System.out.println("The reverse of the input is " + sum);
    }
}