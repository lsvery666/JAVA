package LeetCode016;

import java.util.Arrays;


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < n; i++) {
            int L = i + 1;
            int R = n - 1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            while(L<R){
                int sum = nums[i] + nums[L] + nums[R];
                closest_sum = Math.abs(target-sum) < Math.abs(target-closest_sum) ? sum : closest_sum;
                if(sum == target){
                    return target;
                } else if(sum < target){
                    L++;
                }else {
                    R--;
                }
            }
        }
        return closest_sum;
    }
}