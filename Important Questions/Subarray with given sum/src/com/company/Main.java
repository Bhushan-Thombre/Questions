// Subarray with given sum
// For a given array, return true with the sum of any of the subarray of the given array is equal to given value else return false
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
        System.out.println("Enter the value (sum)");
        int s = input.nextInt();
        boolean ans = givenSumSubarray(arr, s);
        System.out.println("The sum of any of the subarray is the given value");
        System.out.println(ans);
    }


    // Using Hashing (Time Complexity = O(N), Space Complexity = O(N)
    public static boolean givenSumSubarray(int[] arr, int value) {
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_Sum = pre_Sum + arr[i];
            if (pre_Sum == value) {
                return true;
            }
            if (h.contains(pre_Sum - value)) {
                return true;
            }
            h.add(pre_Sum);
        }
        return false;
    }

    // Without using hashing (Time Complexity = O(N * N) )
    public static boolean naive(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == value) {
                    return true;
                }
            }
        }
        return false;
    }



}
