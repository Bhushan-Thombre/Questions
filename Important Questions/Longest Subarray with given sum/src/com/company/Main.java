package com.company;

import java.util.Arrays;
import java.util.HashMap;
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
        System.out.println("Enter the given sum");
        int sum = input.nextInt();
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(arr));
        int ans = maxLength(arr, sum);
        System.out.println("The length of longest subarray with given sum is");
        System.out.println(ans);
    }

    // Time Complexity = O(N),  Space Complexity = O(N)
    public static int maxLength(int[] arr, int sum) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int res = 0;
        int pre_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum = pre_sum + arr[i];
            if (pre_sum == sum) {
                return i + 1;
            }
            if (!m.containsKey(pre_sum)) {
                m.put(pre_sum, i);
            }
            if (m.containsKey(pre_sum - sum)) {
                res = Math.max(res, i - m.get(pre_sum - sum));
            }
        }
        return res;
    }


    // Time Complexity O(N * N)
    public static int naive(int[] arr, int sum) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum = curr_sum + arr[j];
                if (curr_sum == sum) {
                    res = Math.max(res, (j - i) + 1);
                }
            }
        }
        return res;
    }
}
