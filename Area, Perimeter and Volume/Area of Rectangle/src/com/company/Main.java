package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int w = input.nextInt();
        int area = l * w;
        System.out.println("The area of rectangle is " + area);
    }
}