package q13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2022/3/27 by plixiaofei
 */
public class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int index = 0;
        for (int i = index; i < s.length() - 1; i++) {
            int temp = getValue(s.charAt(i));
            if (temp > getValue(s.charAt(i + 1))) {
                res += temp;
            } else {
                res -= temp;
            }
        }
        System.out.println(index);
        return res + getValue(s.charAt(index));
    }

    public int getValue(char chr) {
        // switch lambda
        return switch (chr) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
