package ru.shmvsky;

import java.util.HashMap;
import java.util.Map;

public class leetcode424 {
	public static int characterReplacement(String s, int k) {
        int n = s.length();
        if (n < 2 && k < 2) {
            return n;
        }

        int L = 0, R = 0;
        Map<Character, Integer> hm = new HashMap<>();
        int maxLen = 0, mostFreq = 0;
        
        while (R < n) {
            hm.put(s.charAt(R), hm.getOrDefault(s.charAt(R), 0) + 1);
            mostFreq = Math.max(mostFreq, hm.get(s.charAt(R)));
            
            if (R - L + 1 - mostFreq > k) {
                hm.put(s.charAt(L), hm.get(s.charAt(L)) - 1);
                L++;
            }
			
            maxLen = Math.max(maxLen, R-L+1);
            R++;
        }

        return maxLen;
    }
}
