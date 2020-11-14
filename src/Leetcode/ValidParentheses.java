package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/14/2020, Sat, 7:09 AM
 **/

//https://leetcode.com/problems/valid-parentheses
public class ValidParentheses {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "()"
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: s = "()[]{}"
     * Output: true
     * <p>
     * Example 3:
     * <p>
     * Input: s = "(]"
     * Output: false
     * <p>
     * Example 4:
     * <p>
     * Input: s = "([)]"
     * Output: false
     * <p>
     * Example 5:
     * <p>
     * Input: s = "{[]}"
     * Output: true
     */

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                st.push('}');
            } else if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else {
                if (st.size() == 0 || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.size() == 0;

    }
}
