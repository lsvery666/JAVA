package LeetCode040;

import java.util.*;

/*
给定一个数组candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。

candidates中的每个数字在每个组合中只能使用一次。

说明：

所有数字（包括目标数）都是正整数。
解集不能包含重复的组合。
 */

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> e = new ArrayList<>();
    List<int[]> freq = new ArrayList<>();

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        s.combinationSum2(candidates, target);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // 统计candidates
        for(int num: candidates){
            int size = freq.size();
            if(freq.isEmpty() || num != freq.get(size-1)[0]){
                freq.add(new int[]{num, 1});
            }else{
                ++freq.get(size-1)[1];
            }
        }

        traceback(target, 0);
        return res;
    }

    public void traceback(int target, int cur){
        if(target == 0){
            res.add(new ArrayList<>(e));
            return;
        }

        if(cur==freq.size() || target < freq.get(cur)[0]){
            return;
        }

        int key = freq.get(cur)[0];
        int value = freq.get(cur)[1];

        traceback(target, cur + 1);

        int most = Math.min(value, target / key);
        for (int i = 1; i <= most; i++) {
            e.add(key);
            traceback(target - i * key, cur + 1);
        }
        for(int i = 1; i <= most; i++){
            e.remove(e.size() - 1);
        }
    }
}