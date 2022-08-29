package com.company;

public class Main {

    static int zero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }

    public static void main(String[] args) {
        int ans = zero(30408);
        System.out.println(ans);
    }
}
