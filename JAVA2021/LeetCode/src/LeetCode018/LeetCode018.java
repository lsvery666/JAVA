package LeetCode018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if(n<4){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int a=0;a<n-3;a++){
            if(a!=0 && nums[a]==nums[a-1]){
                continue;
            }
            if(nums[a]+nums[n-3]+nums[n-2]+nums[n-1]<target){
                continue;
            }
            if(nums[a]+nums[a+1]+nums[a+2]+nums[a+3]>target){
                break;
            }
            for(int b=a+1;b<n-2;b++){
                if(b!=a+1 && nums[b]==nums[b-1]){
                    continue;
                }

                if(nums[a]+nums[b]+nums[n-2]+nums[n-1]<target){
                    continue;
                }

                if(nums[a]+nums[b]+nums[b+1]+nums[b+2]>target){
                    break;
                }

                int c = b + 1;
                int d = n - 1;
                while(c<d){
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if(sum == target){
                        res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        while(c < d && nums[c]==nums[c+1]){
                            c++;
                        }
                        while(c < d && nums[d]==nums[d-1]){
                            d--;
                        }
                        c++;
                        d--;
                    }else if(sum < target){
                        c++;
                    }else{
                        d--;
                    }
                }
            }
        }
        return res;
    }
}
