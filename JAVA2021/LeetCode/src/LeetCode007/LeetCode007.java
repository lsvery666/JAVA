package LeetCode007;

class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x!=0){
            int res = x % 10;
            x /= 10;
            if(ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && res > 7){return 0;}
            if(ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && res < -8){return 0;}
            ans = ans * 10 + res;
        }
        return ans;
    }
}
