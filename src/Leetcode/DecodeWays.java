package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/13/2020, Sun, 10:46 AM
 **/

//https://leetcode.com/problems/decode-ways
public class DecodeWays {

    /**
     * A message containing letters from A-Z is being encoded to numbers using the following mapping:
     * <p>
     * 'A' -> 1
     * 'B' -> 2
     * ...
     * 'Z' -> 26
     * Given a non-empty string containing only digits, determine the total number of ways to decode it.
     * <p>
     * The answer is guaranteed to fit in a 32-bit integer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "12"
     * Output: 2
     * Explanation: It could be decoded as "AB" (1 2) or "L" (12).
     * Example 2:
     * <p>
     * Input: s = "226"
     * Output: 3
     * Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
     * Example 3:
     * <p>
     * Input: s = "0"
     * Output: 0
     * Explanation: There is no character that is mapped to a number starting with '0'. We cannot ignore a zero when we face it while decoding. So, each '0' should be part of "10" --> 'J' or "20" --> 'T'.
     * Example 4:
     * <p>
     * Input: s = "1"
     * Output: 1
     *
     * @param s
     * @return number of ways to decode the string
     */

    // Time Complexity = O(n)
    // Space Complexity = O(n)
    public int numDecodings(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        // DP array. Every index will give the number of ways top decode string at length of index
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));

            // If a single last digit is a valid decode, then add to current
            if (oneDigit > 0 && oneDigit < 10) {
                dp[i] += dp[i - 1];
            }

            // If last two digit is a valid decode, then add to curren
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}

