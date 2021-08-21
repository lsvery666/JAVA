package LeetCode011;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1, max_area = 0, area = 0;
        while(left != right){

            if(height[left] < height[right]) {
                area = height[left] * (right - left);
                left++;
            }else{
                area = height[right] * (right - left);
                right--;
            }
            if (area > max_area) {
                max_area = area;
            }
        }
        return max_area;
    }
}