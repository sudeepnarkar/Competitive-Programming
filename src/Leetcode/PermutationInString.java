package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/19/2020, Sat, 6:07 PM
 **/

//https://leetcode.com/problems/permutation-in-string/
public class PermutationInString {

    /**
     * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s1 = "ab" s2 = "eidbaooo"
     * Output: True
     * Explanation: s2 contains one permutation of s1 ("ba").
     * Example 2:
     * <p>
     * Input:s1= "ab" s2 = "eidboaoo"
     * Output: False
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The input strings only contain lower case letters.
     * The length of both given strings is in range [1, 10,000].
     *
     * @param s1
     * @param s2
     * @return true if s2 contains the permutation of s1 or return false
     */

    // Time Complexity = O(M) where M is the length of s2
    // Space Complexity = O(N) where N is the length of s1
    public boolean checkInclusion(String s1, String s2) {

        // Create Character Frequency Map for s1
        HashMap<Character, Integer> map = new HashMap<>();
        for (char s1Char : s1.toCharArray()) {
            map.put(s1Char, map.getOrDefault(s1Char, 0) + 1);
        }
        int counter = map.size();
        int left = 0;
        int right = 0;
        // Two pointer approach
        while (right < s2.length()) {
            char s2Char = s2.charAt(right);
            if (map.containsKey(s2Char)) {
                map.put(s2Char, map.get(s2Char) - 1);
                if (map.get(s2Char) == 0) {
                    counter--;
                }
            }
            right++;
            // All chars required for permutation are covered if counter =0
            while (counter == 0) {
                s2Char = s2.charAt(left);
                if (map.containsKey(s2Char)) {
                    map.put(s2Char, map.get(s2Char) + 1);
                    if (map.get(s2Char) > 0) {
                        counter++;
                    }
                }
                // check if the permutation exists
                if ((right - left) == s1.length()) {
                    return true;
                }
                left++;
            }
        }
        return false;
    }
}
