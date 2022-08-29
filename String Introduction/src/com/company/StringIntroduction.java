// https://www.hackerrank.com/challenges/java-strings-introduction/problem
package com.company;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int a = A.length();
        int b = B.length();
        System.out.println(a + b);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
