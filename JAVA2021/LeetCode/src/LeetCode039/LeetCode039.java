package LeetCode039;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> e = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        traceback(candidates, target, 0);
        return res;
    }

    public void traceback(int[] candidates, int target, int cur){
        if(target == 0){
            res.add(new ArrayList<>(e));
            return;
        }

        if(cur == candidates.length || target<0){
            return;
        }

        // 选
        if(target >= candidates[cur]){
            e.add(candidates[cur]);
            traceback(candidates, target-candidates[cur], cur);
            e.remove(e.size()-1);
        }

        // 不选
        traceback(candidates, target, cur+1);
    }
}
