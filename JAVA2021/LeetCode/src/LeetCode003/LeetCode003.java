package LeetCode003;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> charToIdx = new HashMap<>();
        int left = 0, right = 0, maxLength = 1;

        for(;right<s.length();++right){
            if(charToIdx.containsKey(s.charAt(right))){
                left = Math.max(left, charToIdx.get(s.charAt(right))+1);
            }
            charToIdx.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

