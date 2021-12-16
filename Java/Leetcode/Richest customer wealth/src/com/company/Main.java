// https://leetcode.com/problems/richest-customer-wealth/

package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the 2D array: ");
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
            System.out.println("The array is " + Arrays.toString(arr[row]));
        }
        int a = maximumWealth(arr);
        System.out.println("The richest person has a wealth of: " + a);
    }
    static int maximumWealth(int[][] accounts) {
        int rowsum = 0;
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            for (int anInt : ints) {
                rowsum = rowsum + anInt;
                return rowsum;
            }
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
}
