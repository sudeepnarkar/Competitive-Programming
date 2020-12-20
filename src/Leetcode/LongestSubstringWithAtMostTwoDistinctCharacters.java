package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/20/20, Sun, 11:54 AM
 **/

//https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters
public class LongestSubstringWithAtMostTwoDistinctCharacters {

    /**
     * Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.
     *
     * Example 1:
     *
     * Input: "eceba"
     * Output: 3
     * Explanation: t is "ece" which its length is 3.
     * Example 2:
     *
     * Input: "ccaabbb"
     * Output: 5
     * Explanation: t is "aabbb" which its length is 5.
     * @param s
     * @return  length of the longest substring t  that contains at most 2 distinct characters
     */

    //Time Complexity = O(N) where N is the length of the String S
    //Space Complexity = O(N) where N is the length of the String S
    public int lengthOfLongestSubstringKDistinct(String s) {

        int left = 0;
        int right = 0;
        int counter = 0;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            //increment counter at every new character
            if (map.get(c) == 1) {
                counter++;
            }
            right++;
            // when condition of 3 distinct characters is met, advance left
            while (counter > 2) {
                c = s.charAt(left);
                if (map.containsKey(c)) {
                    // decrement char count
                    map.put(c, map.get(c) - 1);
                    // decrement counter when char count goes back to 0 when left advances
                    if (map.get(c) == 0) {
                        counter--;
                    }
                }
                left++;
            }
            // Get the max length of the substring with at most 2 distinct chars
            len = Math.max(len, right - left);
        }
        return len;
    }
}
