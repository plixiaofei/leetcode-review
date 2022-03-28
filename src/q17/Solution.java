package q17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2022/3/28 by plixiaofei
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) {
            return res;
        }
        String[] letterTable = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            res = combine(res, letterTable[digits.charAt(i) - '0']);
        }
        return res;
    }

    private List<String> combine(List<String> oldRes, String mapperString) {
        List<String> res = new ArrayList<>();
        for(String str: oldRes) {
            for (int i = 0; i < mapperString.length(); i++) {
                res.add(str + mapperString.charAt(i));
            }
        }
        return res;
    }
}
