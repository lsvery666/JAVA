package LeetCode001;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ans = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        for(int a: ans){
            System.out.println(a);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
