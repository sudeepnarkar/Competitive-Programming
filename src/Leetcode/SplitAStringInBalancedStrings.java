package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/25/21, Thu, 5:45 PM
 **/

//https://leetcode.com/problems/split-a-string-in-balanced-strings
public class SplitAStringInBalancedStrings {

    /**
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * <p>
     * Given a balanced string s, split it in the maximum amount of balanced strings.
     * <p>
     * Return the maximum amount of split balanced strings.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
     * Example 2:
     * <p>
     * Input: s = "RLLLLRRRLR"
     * Output: 3
     * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
     * Example 3:
     * <p>
     * Input: s = "LLLLRRRR"
     * Output: 1
     * Explanation: s can be split into "LLLLRRRR".
     * Example 4:
     * <p>
     * Input: s = "RLRRRLLRLL"
     * Output: 2
     * Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 1000
     * s[i] is either 'L' or 'R'.
     * s is a balanced string.
     *
     * @param s
     * @return the maximum amount of split balanced strings.
     */

    //Time Complexity = O(N), where N is the length of the String s
    //Space Complexity = O(1)
    public int balancedStringSplit(String s) {

        int count, countR, countL;
        count = countR = countL = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countL == countR) {
                count++;
            }
        }
        return count;
    }
}
