package ru.shmvsky;

public class leetcode1004 {
	public static int longestOnes(int[] nums, int k) {
        int L = 0, R = 0, maxLen = 0, counter = 0;
        
        while (R < nums.length) {
            if (nums[R] == 0) counter++;
            
            while (counter > k) {
                if (nums[L] == 0) counter--;
                L++;
            }
            R++;
            maxLen = Math.max(maxLen, R-L);
        }
        
        return maxLen;
    }

}
