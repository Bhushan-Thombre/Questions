// https://www.codechef.com/FEB221C/problems/BINBASBASIC

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            input.nextLine();
            String str = input.nextLine();
            int count = palindrome(str);
            if (count <= k) {
                if (str.length() % 2 != 0) {
                    System.out.println("YES");
                }else {
                    if ((k - count) % 2 == 0) {
                        System.out.println("YES");
                    }else {
                        System.out.println("NO");
                    }
                }
            }else {
                System.out.println("NO");
            }
        }
    }

    static int palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (str.charAt(left) != str.charAt(right)) {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}
