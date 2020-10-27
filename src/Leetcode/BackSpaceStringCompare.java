package Leetcode;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 10/27/2020, Tue, 8:46 AM
 **/

//https://leetcode.com/problems/backspace-string-compare/
public class BackSpaceStringCompare {


    /**
     * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
     * <p>
     * Note that after backspacing an empty text, the text will continue empty.
     * <p>
     * Example 1:
     * <p>
     * Input: S = "ab#c", T = "ad#c"
     * Output: true
     * Explanation: Both S and T become "ac".
     * Example 2:
     * <p>
     * Input: S = "ab##", T = "c#d#"
     * Output: true
     * Explanation: Both S and T become "".
     * Example 3:
     * <p>
     * Input: S = "a##c", T = "#a#c"
     * Output: true
     * Explanation: Both S and T become "c".
     * Example 4:
     * <p>
     * Input: S = "a#c", T = "b"
     * Output: false
     * Explanation: S becomes "c" while T becomes "b".
     */


    // TODO: 10/27/2020 Need to optimize the solution to O(1) space 
    public boolean backspaceCompare(String S, String T) {

        Stack<Character> st1 = new Stack();
        Stack<Character> st2 = new Stack();
        char c1 = ' ';
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(c);
            }
        }

        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(c);
            }
        }
        return st1.equals(st2);
    }


}