package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a;
        int large = 0;
        while ((a = input.nextInt()) != 0) {
            large = Math.max(large, a);
        }

        System.out.println("The largest number is " + large);
    }
}