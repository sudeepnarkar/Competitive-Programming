package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/16/2020, Fri, 11:05 PM
 **/

//https://leetcode.com/problems/is-subsequence
public class IsSubsequence {

    /**
     * Given two strings s and t, check if s is a subsequence of t.
     * <p>
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * Example 2:
     * <p>
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= s.length <= 100
     * 0 <= t.length <= 104
     * s and t consist only of lowercase English letters.
     *
     * @param s
     * @param t
     * @return if s is a subsequence of t.
     */

    //Time Complexity = O(Math.max(M,N)), where M and N are the lengths of s and t
    //Space Complexity = O(1)
    public boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) {
            return false;
        }

        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}
