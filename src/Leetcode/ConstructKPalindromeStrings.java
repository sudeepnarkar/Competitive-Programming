package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/8/2020, Tue, 5:34 AM
 **/

//https://leetcode.com/problems/construct-k-palindrome-strings
public class ConstructKPalindromeStrings {


    /**
     * Given a string s and an integer k. You should construct k non-empty palindrome strings using all the characters in s.
     * <p>
     * Return True if you can use all the characters in s to construct k palindrome strings or False otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "annabelle", k = 2
     * Output: true
     * Explanation: You can construct two palindromes using all characters in s.
     * Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
     * <p>
     * Example 2:
     * <p>
     * Input: s = "leetcode", k = 3
     * Output: false
     * Explanation: It is impossible to construct 3 palindromes using all the characters of s.
     * <p>
     * Example 3:
     * <p>
     * Input: s = "true", k = 4
     * Output: true
     * Explanation: The only possible solution is to put each character in a separate string.
     * <p>
     * Example 4:
     * <p>
     * Input: s = "yzyzyzyzyzyzyzy", k = 2
     * Output: true
     * Explanation: Simply you can put all z's in one string and all y's in the other string. Both strings will be palindrome.
     * <p>
     * Example 5:
     * <p>
     * Input: s = "cr", k = 7
     * Output: false
     *
     * @param s
     * @param k
     * @return True if you can use all the characters in s to construct k palindrome strings or False otherwise.
     */

    // Time Complexity = O(N) where N is the length of the String s
    // Space Complexity = O (1). It is O (26) which gets amortized to O (1)
    public boolean canConstruct(String s, int k) {

        /*
          Two conditions check :
          1. The length of the String s should be greater than equal to k
          2. There can be a maximum of K odd occurrence characters in the String.
         */


        if (k > s.length()) {
            return false;
        }

        int oddNum = 0;
        int[] arr = new int[26];
        // count the frequency of each character
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (int n : arr) {
            if (n % 2 == 1) {
                oddNum++;
                if (oddNum > k) {
                    return false;
                }
            }
        }

        return true;
    }
}
