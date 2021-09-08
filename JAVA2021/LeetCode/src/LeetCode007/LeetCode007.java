package LeetCode007;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 *
 */
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
