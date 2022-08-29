// https://www.hackerrank.com/contests/shaandar-september/challenges/bit-magic-3/problem
package com.company;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BitOperations {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String line = br.readLine();
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int a = arr[j] & arr[k];
                int b = arr[j] ^ arr[k];
                if (a >= b) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}