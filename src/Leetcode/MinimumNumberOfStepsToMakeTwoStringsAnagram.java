package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/5/21, Fri, 4:53 PM
 **/

//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    /**
     * Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
     * <p>
     * Return the minimum number of steps to make t an anagram of s.
     * <p>
     * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "bab", t = "aba"
     * Output: 1
     * Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
     * Example 2:
     * <p>
     * Input: s = "leetcode", t = "practice"
     * Output: 5
     * Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
     * Example 3:
     * <p>
     * Input: s = "anagram", t = "mangaar"
     * Output: 0
     * Explanation: "anagram" and "mangaar" are anagrams.
     * Example 4:
     * <p>
     * Input: s = "xxyyzz", t = "xxyyzz"
     * Output: 0
     * Example 5:
     * <p>
     * Input: s = "friend", t = "family"
     * Output: 4
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 50000
     * s.length == t.length
     * s and t contain lower-case English letters only.
     *
     * @param s
     * @param t
     * @return
     */

    //Time Complexity = O(Math.max(N,26)), where N is the length of s or t
    //Space Complexity = O(1)
    public int minSteps(String s, String t) {

        int diff = 0;
        int len = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < len; ++i) {
            ++arr[s.charAt(i) - 'a'];
            --arr[t.charAt(i) - 'a'];
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                diff += arr[i];
            }
        }

        return diff;
    }
}
