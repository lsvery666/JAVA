package LeetCode003;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int ans = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for(int left = 0;left<n;left++){
            if(left!=0){
                set.remove(s.charAt(left-1));
            }
            while(right<n && !set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
            }
            ans = Math.max(ans, right-left);
        }
        return ans;
    }
}

