package ru.shmvsky;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class leetcode3 {
	public static int lengthOfLongestSubstring(String s) {
		int L = 0, R = 0, maxLen = 0;
		int n = s.length();
		Set<Character> set = new HashSet<>();

		while (R < n) {
			if (set.contains(s.charAt(R))) {
				set.remove(s.charAt(L++));
			} else {
				set.add(s.charAt(R++));
			}
			maxLen = Math.max(maxLen, R-L);
		}

		return maxLen;
	}
}
