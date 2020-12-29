package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/29/2020, Tue, 4:53 PM
 **/

//https://leetcode.com/problems/break-a-palindrome
public class BreakAPalindrome {

    /**
     * iven a palindromic string palindrome, replace exactly one character by any lowercase English letter so that the string becomes the lexicographically smallest possible string that isn't a palindrome.
     * <p>
     * After doing so, return the final string.  If there is no way to do so, return the empty string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: palindrome = "abccba"
     * Output: "aaccba"
     * Example 2:
     * <p>
     * Input: palindrome = "a"
     * Output: ""
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= palindrome.length <= 1000
     * palindrome consists of only lowercase English letters.
     *
     * @param palindrome
     * @return lexicographically smallest possible string that isn't a palindrome by replacing one character
     */

    // Time Complexity O(N), where N is the length of the palindrome String
    // Space Complexity O(N)
    public String breakPalindrome(String palindrome) {


        //1. If the length of palindrome string is 1, return an empty string
        //OR
        //2. Traverse first half of the string and replace any non - 'a' char with 'a' and return the string
        //OR
        //3. Replace the last char with 'b' and return the string

        if (palindrome.length() == 1) {
            return "";
        }

        char[] res = palindrome.toCharArray();
        int i = -1;
        int halfLen = palindrome.length() / 2;

        while (++i < halfLen) {
            if (res[i] != 'a') {
                res[i] = 'a';
                return String.valueOf(res);
            }
        }

        res[res.length - 1] = 'b';
        return String.valueOf(res);
    }
}
