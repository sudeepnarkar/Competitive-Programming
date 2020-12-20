package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/20/20, Sun, 11:32 AM
 **/
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * <p>
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * <p>
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     * Example 4:
     * <p>
     * Input: s = ""
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     *
     * @param s
     * @return length of the longest substring without repeating characters.
     */

    // Time Complexity = O(N) where N is the length of the String S
    // Space Complexity = O(N) where N is the length of the String S
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int counter = 0;
        int len = 0;
        // Maintain char frequency in a map
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            // increment counter when char gets repeated
            if (map.get(c) > 1) {
                counter++;
            }
            right++;
            while (counter == 1) {
                c = s.charAt(left);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    // decrement counter when count of char gets back to one
                    if (map.get(c) == 1) {
                        counter--;
                    }
                }
                left++;
            }
            // calculate the max length
            len = Math.max(len, right - left);
        }
        return len;
    }
}
