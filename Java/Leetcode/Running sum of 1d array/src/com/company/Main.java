// https://leetcode.com/problems/running-sum-of-1d-array/

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        System.out.println("The running sum is " + Arrays.toString(result));

    }
}
