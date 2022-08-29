package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in Rupee");
        double r = input.nextFloat();
        double d = r / 74.16;
        System.out.println("Amount in Dollars is " + d);
    }
}