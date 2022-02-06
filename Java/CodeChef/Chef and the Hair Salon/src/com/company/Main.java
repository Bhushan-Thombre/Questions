// https://www.codechef.com/FEB221C/problems/CHEFBARBER

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int ans = n * m;
            System.out.println(ans);
        }

    }
}
