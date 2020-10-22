package Leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 10/22/2020, Thu, 6:52 PM
 **/

//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    /**
     * Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.
     * <p>
     * Return the maximum possible length of s.
     * <p>
     * Example 1:
     * <p>
     * Input: arr = ["un","iq","ue"]
     * Output: 4
     * Explanation: All possible concatenations are "","un","iq","ue","uniq" and "ique".
     * Maximum length is 4.
     * Example 2:
     * <p>
     * Input: arr = ["cha","r","act","ers"]
     * Output: 6
     * Explanation: Possible solutions are "chaers" and "acters".
     * Example 3:
     * <p>
     * Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
     * Output: 26
     */


    int res = 0;

    public int maxLength(List<String> arr) {
        dfs(0, arr, "");
        return res;
    }

    //backtracking approach to get the maximum length
    public void dfs(int start, List<String> arr, String curr) {
        if (!isUnique(curr)) {
            return;
        }

        res = Math.max(curr.length(), res);
        for (int i = start; i < arr.size(); i++) {
            String str = arr.get(i);
            dfs(i + 1, arr, curr + arr.get(i));
        }
    }

    public boolean isUnique(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}