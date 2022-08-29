// https://www.codechef.com/problems/PCJ18B

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int n = input.nextInt();
            int count = 0;
            for (int i = n; i >= 0; i = i - 2) {
                count = count + (i * i);
            }
            System.out.println(count);
            t--;
        }
    }
}

// For a chessboard of size n, the number of squares with odd side length = (n - l + 1) * (n - l + 1) where l is the odd side length.
