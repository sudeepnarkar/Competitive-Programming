package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 12/24/20, Thu, 6:40 PM
 **/
//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
public class MinimumRemoveToMakeValidParentheses {


    /**
     * Given a string s of '(' , ')' and lowercase English characters.
     * <p>
     * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
     * <p>
     * Formally, a parentheses string is valid if and only if:
     * <p>
     * It is the empty string, contains only lowercase characters, or
     * It can be written as AB (A concatenated with B), where A and B are valid strings, or
     * It can be written as (A), where A is a valid string.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "lee(t(c)o)de)"
     * Output: "lee(t(c)o)de"
     * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
     * Example 2:
     * <p>
     * Input: s = "a)b(c)d"
     * Output: "ab(c)d"
     * Example 3:
     * <p>
     * Input: s = "))(("
     * Output: ""
     * Explanation: An empty string is also valid.
     * Example 4:
     * <p>
     * Input: s = "(a(b(c)d)"
     * Output: "a(b(c)d)"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 10^5
     * s[i] is one of  '(' , ')' and lowercase English letters.
     */

    // Time Complexity = O(N), where N is the length of s
    // Space Complexity = O(N), where N is the length of s
    public String minRemoveToMakeValidUsingStack(String s) {

        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(i);
            } else if (c == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    // add to indices to remove
                    set.add(i);
                }
            }
        }

        while (!st.isEmpty()) {
            // add to indices to remove
            set.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //exclude indices in set
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // Time Complexity = O(N), where N is the length of s
    // Space Complexity = O(N), where N is the length of s
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb1 = removeInvalidIndices(s, '(', ')');
        StringBuilder sb2 = removeInvalidIndices(sb1.reverse().toString(), ')', '(');
        return sb2.reverse().toString();

    }

    public StringBuilder removeInvalidIndices(String s, char open, char close) {

        StringBuilder sb = new StringBuilder();
        int openCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == open) {
                openCount++;
            } else if (c == close) {
                if (openCount == 0) {
                    continue;
                }
                openCount--;
            }
            // append all chars except when openCount is zero
            sb.append(c);
        }
        return sb;
    }
}
