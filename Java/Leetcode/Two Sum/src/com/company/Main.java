package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t = 6;
        int[] a = twoSum(arr, t);
        System.out.println(Arrays.toString(a));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int ans = nums[i] + nums[j];
                if (target == ans) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}