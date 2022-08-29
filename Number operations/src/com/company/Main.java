package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Mathematical operations");
        int sum = a+b;
        System.out.println("Addition of the two numbers is " + sum);
        int diff;
        if (a>b) {
            diff = a - b;
        }
        else {
            diff = b - a;
        }
        System.out.println("Difference of two numbers is " + diff);
        int product = a*b;
        System.out.println("Product of two numbers is " + product);
        float div = a/b;
        System.out.println("Division of two numbers is " + div);
    }
}