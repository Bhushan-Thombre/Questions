package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = input.nextInt();
        double area = (3.14) * r * r;
        System.out.println("The area of the Circle is: " + area);
    }
}
