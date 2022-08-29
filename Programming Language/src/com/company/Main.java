// https://www.codechef.com/problems/PROGLANG
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = input.nextInt();
            }
            if ((arr[0] == arr[3] && arr[1] == arr[2]) || (arr[0] == arr[2] && arr[1] == arr[3])) {
                System.out.println("1");
            }else if ((arr[0] == arr[5] && arr[1] == arr[4]) || (arr[0] == arr[4] && arr[1] == arr[5])) {
                System.out.println("2");
            }else {
                System.out.println("0");
            }

            t--;
        }
    }
}
