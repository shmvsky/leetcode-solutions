package ru.shmvsky;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 */

public class leetcode53 {
	public static int maxSubArray(int[] nums) {
		int currSum, maxSum;
		currSum = maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int n = nums[i];
			currSum = Math.max(n, currSum + n);
			maxSum = Math.max(currSum, maxSum);
		}
		
		return maxSum;
	}
}
