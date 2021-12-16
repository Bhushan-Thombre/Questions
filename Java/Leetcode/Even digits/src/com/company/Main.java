// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.company;


public class Main {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int cont = 0;
        for (int num: nums){
            if (even(num)) {
                cont++;
            }
        }
        return cont;
    }
    static boolean even(int n) {
        int noofdigits = digits(n);
        return noofdigits % 2 == 0;
    }
    static int digits(int n) {
        if (n < 0) {
            return n * -1;
        }
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}