import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // General Idea: Double points, one for lowest element of substring, one for
        // highest element of substring
        // Use hashmap to store positions of all characters in substring
        int low = 0;
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                low = Math.max(low, map.get(c) + 1);
            }
            map.put(c, i);
            len = Math.max(i - low + 1, len);
        }
        return len;
    }
}
// @lc code=end
