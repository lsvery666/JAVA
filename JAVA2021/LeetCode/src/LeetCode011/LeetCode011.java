package LeetCode011;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 */
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1, max_area = 0, area = 0;
        while(left != right){
            area = (right-left) * (height[left] < height[right] ? height[left++] : height[right--]);
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }
}