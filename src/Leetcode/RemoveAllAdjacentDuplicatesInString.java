package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 10/29/2020, Thu, 10:28 PM
 **/

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
public class RemoveAllAdjacentDuplicatesInString {

    /**
     * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
     * <p>
     * We repeatedly make duplicate removals on S until we no longer can.
     * <p>
     * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
     * <p>
     * Example 1:
     * <p>
     * Input: "abbaca"
     * Output: "ca"
     * Explanation:
     * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
     * The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
     */

    public String removeDuplicates(String S) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}
