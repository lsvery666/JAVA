package LeetCode026;

/*
给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int num = 0;
        int pre = 100000;
        for (int i = 0; i < len; i++) {
            if(nums[i]!=pre){
                nums[num] = nums[i];
                pre = nums[i];
                num++;
            }
        }
        return num;
    }
}
