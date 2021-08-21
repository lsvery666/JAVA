package Offer061;

import java.util.Arrays;

/*
扑克牌中的顺子
 */

class Solution {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for(int i=0;i<4;i++){
            if(nums[i]==0){
                joker++;
                continue;
            }
            if(nums[i]==nums[i+1]) return false;
        }
        return nums[4] - nums[joker] < 5;
    }
}
