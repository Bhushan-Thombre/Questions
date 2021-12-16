package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a 2D array: ");
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][3];
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = input.nextInt();
            }
            System.out.println("The 2D array is: " + Arrays.toString(nums[row]));
        }
        System.out.println("Enter a number to search in an array: ");
        int l = input.nextInt();
        int[] ans = search(nums, l);
        System.out.println("The rows and column in which the number is present is: " + Arrays.toString(ans));
        int ans1 = max(nums);
        System.out.println("The largest number in the 2D array is: " + ans1);
    }
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] marr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0, marrLength = marr.length; i < marrLength; i++) {
            int[] ints = marr[i];
            for (int j = 0, intsLength = ints.length; j < intsLength; j++) {
                int anInt = ints[j];
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}