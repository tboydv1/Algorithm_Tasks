package com.algo.leetcode;

import java.util.Arrays;

public class ProductDifference {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        int a = nums.length;

        Arrays.sort(nums);

        int maxDiff = (nums[a - 1] * nums[a - 2]) - (nums[0] * nums[1]);

        System.out.println(maxDiff);
    }
}
