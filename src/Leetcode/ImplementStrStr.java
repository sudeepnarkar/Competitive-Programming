package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/17/2020, Thu, 8:23 PM
 **/

//https://leetcode.com/problems/implement-strstr
public class ImplementStrStr {


    /**
     * Implement strStr().
     * <p>
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * <p>
     * Clarification:
     * <p>
     * What should we return when needle is an empty string? This is a great question to ask during an interview.
     * <p>
     * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     * Example 2:
     * <p>
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     * Example 3:
     * <p>
     * Input: haystack = "", needle = ""
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= haystack.length, needle.length <= 5 * 104
     * haystack and needle consist of only lower-case English characters.
     *
     * @param haystack
     * @param needle
     * @return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */

    // Time Complexity  = 0(N) where N is the length of haystack
    // Space Complexity  = 0(N+M) where N is the length of haystack and M is the length of needle
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0) {
            return -1;
        }

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for (int i = 0; i < haystackArr.length; i++) {
            if (i + (needleArr.length - 1) >= haystackArr.length) {
                return -1;
            }
            for (int j = 0; j < needleArr.length; j++) {
                if (haystackArr[i + j] != needleArr[j]) {
                    break;
                }
                if (j == needleArr.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
