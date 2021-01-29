import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // General idea: Use hashmap to store the residual part and index as well
        // For example: for a target 10, we have 4 at index 0, we store (6, 0) into map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No solution found!");

    }
}
// @lc code=end
