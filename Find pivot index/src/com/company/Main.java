// https://leetcode.com/problems/find-pivot-index/
// https://dev.to/kaflenitish/solving-find-pivot-index-from-leetcode-explanation-m6o

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6};
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums) {
            totalSum = totalSum + num;
        }
        for (int j = 0; j < nums.length; j++) {
            if (totalSum - leftSum - nums[j] == leftSum) {
                System.out.println("The pivot index is: " + j );
            }
            leftSum = leftSum + nums[j];
        }
    }
}
