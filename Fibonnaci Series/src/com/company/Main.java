package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the nth number in the Fibonnaci Series");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The nth number in the Fibonnaci series is " + b);
    }
}