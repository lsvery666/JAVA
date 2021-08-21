package Offer053_2;

/*
一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */

class Solution {
    public int missingNumber(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}
