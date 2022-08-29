package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        System.out.println(gcdNaive(a, b));
        System.out.println(gcd(a, b));
        System.out.println(gcdOptimized(a, b));
    }

    // Time Complexity = O(min(a, b))
    public static int gcdNaive(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    // Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }

    // Optimized implementation of Euclidean Algorithm
    // Time Complexity = O(log(min(a, b)))
    public static int gcdOptimized(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return gcdOptimized(b, a % b);
        }
    }
}
