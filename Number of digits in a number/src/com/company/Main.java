package com.company;

public class Main {

    public static void main(String[] args) {
        int ans = noDigits(1234);
        System.out.println(ans);
    }
    static int noDigits(int n) {
        return (int)(Math.log10(n)) + 1;
    }
}
