package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println("The factors are " + i);
            }
        }
    }
}