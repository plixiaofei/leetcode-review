package q11;

/**
 * Created on 2022/3/27 by plixiaofei
 */
public class Solution {
    public int axArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            // 面积计算
            int temp = (right - left) * Math.min(height[left], height[right]);
            // 最大
            max = Math.max(temp, max);
            // 推进条件，贪心，找出最高高度
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }
        return max;
    }
}
