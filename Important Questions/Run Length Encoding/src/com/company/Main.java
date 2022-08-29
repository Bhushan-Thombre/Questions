// Given an input string, write a function that returns the Run Length Encoded string for the input string.
//For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”

package com.company;

import java.util.Scanner;

public class Main {

    public static void RLE(String str) {

        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }

    public static void main(String[] args) {
//        String str = "aaabbbccc";
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        RLE(str);
    }
}
