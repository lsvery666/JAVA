package LeetCode031;

/*
实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。

如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。

必须 原地 修改，只允许使用额外常数空间。

 */

class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len-2; i >= 0 ; i--) {
            if(nums[i]<nums[i+1]){
                for(int j = len-1; j>i; j--){
                    if(nums[j] > nums[i]){
                        int tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                        reverse(nums, i +1, len-1);
                        return;
                    }
                }
            }
        }
        reverse(nums, 0, len-1);
    }

    public void reverse(int[] nums, int start, int end){
        for (int i = 0; i < (end-start+1)/2; i++) {
            int tmp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = tmp;
        }
    }

}
