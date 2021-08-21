package LeetCode034;

/*
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回[-1, -1]。

进阶：

你可以设计并实现时间复杂度为O(log n)的算法解决此问题吗？
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){return new int[]{-1, -1};}
        return searchRange(nums, 0, nums.length-1, target);
    }

    public int[] searchRange(int[] nums, int start, int end, int target) {
        if(start < end){
            if(nums[start]!=target || nums[end] !=target){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    int[] leftRes = searchRange(nums, start, mid-1, target);
                    int[] rightRes = searchRange(nums, mid+1, end, target);
                    int left, right;
                    left = leftRes[0] == -1 ? mid : leftRes[0];
                    right = rightRes[0] == -1 ? mid : rightRes[1];
                    return new int[]{left, right};
                }else if(nums[mid] < target){
                    return searchRange(nums, mid+1, end, target);
                }else{
                    return searchRange(nums, start, mid-1, target);
                }
            }
            else{
                return new int[]{start, end};
            }
        }else{
            if(nums[start] == target){
                return new int[]{start, start};
            }else{
                return new int[]{-1, -1};
            }
        }
    }
}