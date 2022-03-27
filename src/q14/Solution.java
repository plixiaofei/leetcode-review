package q14;

import java.util.Arrays;

/**
 * Created on 2022/3/27 by plixiaofei
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length() && first.charAt(index) == last.charAt(index)) {
            index ++;
        }
        return first.substring(0, index);
    }
}
