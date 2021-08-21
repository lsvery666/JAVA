package LeetCode016;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = 0;
        int min_dis = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int L = i + 1;
            int R = n - 1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            while(L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum<target){
                    L++;
                }else if(sum>target){
                    R--;
                }else{
                    return target;
                }
                if(Math.abs(sum-target)<min_dis){
                    closest_sum = sum;
                    min_dis = Math.abs(sum-target);
                }
            }
        }
        return closest_sum;
    }
}