package q1;

import java.util.HashMap;

/**
 * Created on 2022/3/25 by plixiaofei
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hashMap.containsKey(value)) {
                return new int[]{hashMap.get(value), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
