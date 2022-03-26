package q5;

/**
 * Created on 2022/3/26 by plixiaofei
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String longestSub = "";
        // 这个边界难判断，举例子的时候不要遗漏
        for (int i = 0; i < s.length(); i ++) {
            String evenStr = expand(s, i, i);
            String oddStr = expand(s, i, i + 1);
            String tempSub = evenStr.length() > oddStr.length() ? evenStr : oddStr;
            longestSub = longestSub.length() > tempSub.length() ? longestSub : tempSub;
        }
        return longestSub;
    }

    /**
     * 从中间展开来判断回文序列
     * @param s 原字符串
     * @param start 开始
     * @param end 结束
     * @return 得到的字符串
     */
    private String expand(String s, int start, int end) {
        while (start >= 0 &&
                end < s.length() &&
                s.charAt(start) == s.charAt(end)) {
            start --;
            end ++;
        }
        /**
         * abcbda
         * 对于 start ，多减了1
         * 对于 end，多加了2
         */
        int beginIndex = start + 1;
        int endIndex = beginIndex + end - start + 1 - 2;
        return s.substring(beginIndex, endIndex);
    }
}
