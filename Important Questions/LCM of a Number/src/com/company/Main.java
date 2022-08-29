package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(lcmNaive(a, b));
        System.out.println(lcm(a, b));
    }

    // Time Complexity = O(a * b - max(a, b))
    public static int lcmNaive(int a, int b) {
        int res = Math.max(a, b);
        while (res > 0) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    // Formula =>> (a * b) = gcd(a, b) * lcm(a, b)
    // Time Complexity = O(log(min(a, b)))
    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        return lcm;
    }
}
