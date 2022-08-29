package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter an array of integers: ");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[7];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = input.nextInt();
        }
        System.out.println("The array of integers is: " + Arrays.toString(nums));
        System.out.println("The minimum number in the given array is: " + min(nums));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}