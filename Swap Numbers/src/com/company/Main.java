package com.company;

import java.util.Arrays;
// The program will swap the number at index 4 with the number at index 0 and vice versa
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index0, int index4) {
        int temp = arr[index0];
        arr[index0] = arr[index4];
        arr[index4] = temp;
    }
}