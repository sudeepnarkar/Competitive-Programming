package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/8/2020, Tue, 6:46 AM
 **/

//https://leetcode.com/problems/longest-common-prefix
public class LongestCommonPrefix {


    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * <p>
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     * @param strs
     * @return Longest Common Prefix string
     */
    // Time Complexity = O (m*n) where m is the length of the str array and n is the length of each string
    // Space Complexity = O (n), where n is the length of the first string
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;
        char c;
        while (index < strs[0].length()) {
            c = strs[0].charAt(index);
            for (int j = 1; j < strs.length; j++) {
                if (index < strs[j].length() && c == strs[j].charAt(index)) {
                    continue;
                } else {
                    return (sb.toString());
                }
            }
            index++;
            sb.append(c);
        }
        return sb.toString();
    }
}
