package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/2/2020, Wed, 8:24 PM
 **/

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    /**
     * Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * <p>
     * <p>
     * Example 1:inPalindrome
     * Input: s = "Hello World"
     * Output: 5
     * <p>
     * Example 2:
     * <p>
     * Input: s = " "
     * Output: 0
     *
     * @param s
     * @return length of the last word in the string. If the last word does not exist, return 0.
     */

    // Time complexity = O(n)
    // Space complexity = O(n)
    public int lengthOfLastWord(String s) {

        s = s.trim();
        String[] arr = s.split(" ");

        if (arr.length == 0) {
            return 0;
        }

        return arr[arr.length - 1].length();
    }
}
