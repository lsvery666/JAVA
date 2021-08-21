package LeetCode033;

/*
搜索旋转排序数组
 */

class Solution {

    public int search(int[] nums, int target) {

        int len = nums.length, l = 0, r = len - 1;
        while(l<=r){
            int mid = (r + l) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(mid == l){
                l = mid + 1;
                continue;
            }
            if(nums[l]<=nums[mid-1]){
                // 前半部分有序
                if(target >= nums[l] && target <= nums[mid-1]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                // 后半部分有序
                if(target >= nums[mid+1] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}