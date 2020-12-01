package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/30/2020, Mon, 9:10 PM
 **/

//https://leetcode.com/problems/longest-palindromic-substring
public class LongestPalindromicSubstring {

    /**
     * Given a string s, return the longest palindromic substring in s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "cbbd"
     * Output: "bb"
     * <p>
     * Example 3:
     * <p>
     * Input: s = "a"
     * Output: "a"
     * <p>
     * Example 4:
     * <p>
     * Input: s = "ac"
     *
     * @param s
     * @return longest Palindromic substring
     */

    // Time complexity = O(n^2), as we traverse the string once and at every character we do an odd and even palindrome traversal check
    // Space Complexity = O(n) to store string
    //TODO : Optimize the solution
    public String longestPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1) {
            return String.valueOf(s.charAt(0));
        }

        String longestPalindrome = String.valueOf(s.charAt(0));
        String oddPalindrome = "";
        String evenPalindrome = "";
        int oddPalindromeLen = 0;
        int evenPalindromeLen = 0;
        int longest = 0;
        boolean evenLongest = false;
        boolean oddLongest = false;
        for (int i = 1; i < s.length(); i++) {
            oddPalindrome = getLongestPalindrome(s, i - 1, i + 1);
            evenPalindrome = getLongestPalindrome(s, i - 1, i);
            oddPalindromeLen = oddPalindrome.length();
            evenPalindromeLen = evenPalindrome.length();
            if (evenPalindromeLen > oddPalindromeLen) {
                evenLongest = true;
            } else {
                oddLongest = true;
            }
            if (evenLongest && evenPalindromeLen > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
            if (oddLongest && oddPalindromeLen > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            evenLongest = false;
            oddLongest = false;
        }
        return longestPalindrome;
    }

    public String getLongestPalindrome(String s, int start, int end) {

        while (start >= 0 && end < s.length()) {
            // If chars not equal then break
            if (s.charAt(start) != s.charAt(end)) {
                break;
            }
            // expand out towards left and right ends
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}
