package com.company;

import java.util.Scanner;

// Largest number in an array
public class Array {
    public static void main(String[] args) {
        System.out.print("Enter array of Integers: ");
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The Largest number in the array is " + max(arr));
    }
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int j : arr) {
            if (j > maxVal) {
                maxVal = j;
            }
        }
        return maxVal;
    }
}
