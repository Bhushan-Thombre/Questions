// https://www.codechef.com/FEB221C/problems/EUREKA

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            double f = Math.pow(0.143 * n, n);
            long ans = Math.round(f);
            System.out.println(ans);
        }
    }
}
