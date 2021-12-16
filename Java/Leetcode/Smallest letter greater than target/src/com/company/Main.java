package com.company;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Main {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 's', 'y'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[letters.length % start];
    }
}