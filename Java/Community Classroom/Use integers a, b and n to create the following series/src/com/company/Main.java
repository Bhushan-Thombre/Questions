package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of series: ");
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            for (int j = 0; j < n; j++) {
                a = a + b;
                if (j > 0)
                    System.out.print(" ");
                    System.out.print(a);
                    b = b * 2;
            }
            System.out.println(" ");
        }
        input.close();
    }
}