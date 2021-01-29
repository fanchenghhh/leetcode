/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            // Check whether overflow or underflow occurs
            if (newResult / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }
}
// @lc code=end
