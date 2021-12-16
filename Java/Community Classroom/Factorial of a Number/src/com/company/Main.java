package com.company;
import java.util.Scanner;

// Factorial of a number using for loop.

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int fact = 1;
        int n = input.nextInt();
        for (int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of given number is " + fact);
    }
}

// Factorial of a number using recursion.

//  package com.company;
//  import java.util.Scanner;
//  public class Main {
//    static int factorial(int n) {
//        if (n==0) {
//            return 1;
//        }
//        else {
//            return (n*factorial(n-1));
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter a number:");
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        int fact = 1;
//        fact = factorial(number);
//        System.out.println("The Factorial of given number is " + fact);
//    }
//  }