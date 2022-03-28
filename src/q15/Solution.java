package q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created on 2022/3/28 by plixiaofei
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int index = 0;
        HashSet<List<Integer>> res = new HashSet<>();
        while (index < nums.length) {
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(List.of(nums[index], nums[left], nums[right]));
                    left ++;
                    right --;
                } else if (sum > 0) {
                    right --;
                } else {
                    left ++;
                }
            }
            index ++;
        }
        return new ArrayList<>(res);
    }
}
