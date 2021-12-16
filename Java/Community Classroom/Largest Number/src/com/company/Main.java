package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        if (a>b) {
            System.out.println(a + " is the largest number");
        }
        else {
            System.out.println(b + " is the largest number");
        }
    }
}
