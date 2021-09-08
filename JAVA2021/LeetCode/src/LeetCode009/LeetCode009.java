package LeetCode009;

/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed_num = 0;
        // x > reversed_num是精髓，只会反转一半的数字
        while(x > reversed_num){
            int pop = x % 10;
            x /= 10;
            reversed_num = reversed_num * 10 + pop;
        }
        return reversed_num == x || reversed_num / 10 == x;
    }
}