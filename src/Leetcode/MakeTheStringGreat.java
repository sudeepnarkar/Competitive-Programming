package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 12/29/2020, Tue, 4:15 PM
 **/

//https://leetcode.com/problems/make-the-string-great
public class MakeTheStringGreat {

    /**
     * Given a string s of lower and upper case English letters.
     * <p>
     * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
     * <p>
     * 0 <= i <= s.length - 2
     * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
     * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
     * <p>
     * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
     * <p>
     * Notice that an empty string is also good.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "leEeetcode"
     * Output: "leetcode"
     * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
     * Example 2:
     * <p>
     * Input: s = "abBAcC"
     * Output: ""
     * Explanation: We have many possible scenarios, and all lead to the same answer. For example:
     * "abBAcC" --> "aAcC" --> "cC" --> ""
     * "abBAcC" --> "abBA" --> "aA" --> ""
     * Example 3:
     * <p>
     * Input: s = "s"
     * Output: "s"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 100
     * s contains only lower and upper case English letters.
     *
     * @param s
     * @return the string after making it good.
     */

    // Time Complexity = O(N), where N is the length of the String
    // Space Complexity = O(N), where N is the maximum space used by the Stack
    public String makeGood(String s) {

        Stack<Character> st = new Stack<>();
        int i = -1;
        while (++i < s.length()) {
            char c = s.charAt(i);
            if (!st.isEmpty() && Math.abs(st.peek() - c) == 32) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}
