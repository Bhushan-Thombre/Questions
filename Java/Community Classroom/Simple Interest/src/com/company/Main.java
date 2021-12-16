package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculation of Simple Interest");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        float p = input.nextFloat();
        System.out.println("Enter rate of interest");
        float r = input.nextFloat();
        System.out.println("Enter time peroid");
        int t = input.nextInt();
        float si = p*r*t/100;
        System.out.println("The simple interest is " + si);
    }
}