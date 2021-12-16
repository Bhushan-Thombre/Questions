package com.company;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 2, 1};
        int t = 5;
        int ans = search(nums, t);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        int firstry = orderAgnosticBS(arr, target, 0, peak);
        if (firstry != -1) {
            return firstry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }
    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}