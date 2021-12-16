package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of all numbers till the number entered is zero.");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int a;
        while ( (a = input.nextInt()) != 0) {
            sum = sum + a;
        }
        System.out.println("The sum is " + sum);
    }
}