package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/20/20, Sun, 11:40 AM
 **/

//https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters
public class LongestSubstringWithAtMostKDistinctCharacters {

    /**
     * Given a string, find the length of the longest substring T that contains at most k distinct characters.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "eceba", k = 2
     * Output: 3
     * Explanation: T is "ece" which its length is 3.
     * Example 2:
     * <p>
     * Input: s = "aa", k = 1
     * Output: 2
     * Explanation: T is "aa" which its length is 2.
     *
     * @param s
     * @param k
     * @return length of the longest substring T that contains at most k distinct characters.
     */

    //Time Complexity = O(N) where N is the length of the String S
    //Space Complexity = O(N) where N is the length of the String S
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

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
            // when condition of K+1 distinct characters is met, advance left
            while (counter > k) {
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
            // Get the max length of the substring with at most K distinct chars
            len = Math.max(len, right - left);
        }
        return len;
    }
}
