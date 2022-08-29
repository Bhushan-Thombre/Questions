package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n==1) {
            System.out.println("The number is neither even nor odd");
        }
        else if ( n%2 == 0) {
            System.out.println("The given number is an even number");
        }
        else {
            System.out.println("The given number is an odd number");
        }
    }
}