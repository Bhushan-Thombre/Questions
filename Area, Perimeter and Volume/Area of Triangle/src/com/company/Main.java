package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double area;
        if (a == b && a==c) {
            area = 0.433 * a * a;
            System.out.println("The area of the triangle is: " + area);
        }
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("Enter the height of the triangle: ");
            int h = input.nextInt();
            if (a == b) {
                area = 0.5 * h * c;
            } else {
                area = 0.5 * h * b;
            }
            System.out.println("The area of triangle is: " + area);
        }
        if (a != b && a != c && b != c) {
            int s = (a + b + c) / 3;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the triangle is: " + area);
        }
    }
}