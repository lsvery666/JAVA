package LeetCode046;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0, nums.length);
        return res;
    }

    public void permute(int[] nums, int start, int end){
        if(start == end){
            res.add(asList(nums));
        }
        for(int i=start;i<end;i++){
            swap(nums, start, i);
            permute(nums, start+1, end);
            swap(nums, start, i);
        }
    }

    public void swap(int[] nums, int pos1, int pos2){
        int tmp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = tmp;
    }

    public List<Integer> asList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        return list;
    }
}