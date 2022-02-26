// Subarray with 0 sum
// For a given array, return true with the sum of any of the subarray of the given array is 0 else return false
package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array inputs");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(arr));
        boolean ans = naive(arr);
        System.out.println("The sum of any of the subarray is 0");
        System.out.println(ans);
    }


    // Using Hashing (Time Complexity = O(N), Space Complexity = O(N)
    public static boolean zeroSumSubarray(int[] arr) {
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_Sum = pre_Sum + arr[i];
            if (h.contains(pre_Sum)) {
                return true;
            }
            if (pre_Sum == 0) {
                return true;
            }
            h.add(pre_Sum);
        }
        return false;
    }

    // Without using hashing (Time Complexity = O(N * N) )
    public static boolean naive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }



}
