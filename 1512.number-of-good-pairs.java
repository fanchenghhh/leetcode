/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        // General idea: Record the number of occurrences of each number
        int[] count = new int[101];
        int n = 0;
        for (int i : nums) {
            n += count[i];
            count[i]++;
        }
        return n;
    }
}
// @lc code=end
