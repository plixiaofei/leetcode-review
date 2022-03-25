package q3;

import java.util.HashMap;

/**
 * 不好想，第二遍差点忘了
 * 思路：双指针 + hashMap 存储
 * 重点在 while 循环
 * 第一个 if 如果已包含 s.charAt(right) 说明重复了，left 移动的位置就是 left 当前位置与哈希表中存在的 right 位置的最大值
 * Created on 2022/3/25 by plixiaofei
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int len = 0;
        while (right < s.length()) {
            if (hashMap.containsKey(s.charAt(right))) {
                // abba 连在一起的情况，当然取最大值
                left = Math.max(left, hashMap.get(s.charAt(right)) + 1);
            }
            hashMap.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right ++;
        }
        return 0;
    }
}
