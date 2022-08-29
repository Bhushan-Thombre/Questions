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
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(arr));
        int ans = maxLength(arr);
        System.out.println("The length of longest subarray with equal number of zero and one is");
        System.out.println(ans);
    }

    public static int maxLength(int[] arr) {
        int sum = 0;
        int maxsize = -1, startindex = 0;
        int endindex = 0;

        // Pick a starting point as i

        for (int i = 0; i < arr.length - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1;

            // Consider all subarrays starting from i

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 0)
                    sum += -1;
                else
                    sum += 1;

                // If this is a 0 sum subarray, then
                // compare it with maximum size subarray
                // calculated so far

                if (sum == 0 && maxsize < j - i + 1) {
                    maxsize = j - i + 1;
                    startindex = i;
                }
            }
        }
        endindex = startindex + maxsize - 1;
        if (maxsize == -1)
            System.out.println("No such subarray");
        else
            System.out.println(startindex + " to " + endindex);

        return maxsize;


    }

    // Time Complexity = O(N * N)
    public static int naive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int zero = 0;
            int one = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zero++;
                }else {
                    one++;
                }
                if (zero == one) {
                    res = Math.max(res, (j - i) + 1);
                }
            }
        }
        return res;
    }
}
