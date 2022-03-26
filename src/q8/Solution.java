package q8;

import java.net.Inet4Address;

/**
 * Created on 2022/3/26 by plixiaofei
 */
public class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        int index = 0;
        int ret = 0;
        // 默认正数
        boolean isPositive = true;
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            // 判断具体符号，随后 index + 1
            isPositive = s.charAt(index ++) != '-';
        }
        // 获得除符号的子串
        s = s.substring(index);
        index = 0;
        while (index < s.length() && s.charAt(index) <= '9' && s.charAt(index) >= '0') {
            if (ret > Integer.MAX_VALUE / 10 ||
                    (ret == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > Integer.MAX_VALUE % 10 )) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ret = ret * 10 + s.charAt(index ++) - '0';
        }
        return isPositive ? ret : -1 * ret;
    }
}
