package q7;

/**
 * Created on 2022/3/26 by plixiaofei
 */
public class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int mod = x % 10;
            x /= 10;
            // res 提前一步判断
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + mod;
        }
        return res;
    }
}
