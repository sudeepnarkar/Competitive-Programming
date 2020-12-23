package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 12/23/20, Wed, 8:01 AM
 **/

//https://leetcode.com/problems/baseball-game
public class BaseballGame {

    /**
     * You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
     * <p>
     * At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
     * <p>
     * An integer x - Record a new score of x.
     * "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
     * "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
     * "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
     * Return the sum of all the scores on the record.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ops = ["5","2","C","D","+"]
     * Output: 30
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "2" - Add 2 to the record, record is now [5, 2].
     * "C" - Invalidate and remove the previous score, record is now [5].
     * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
     * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
     * The total sum is 5 + 10 + 15 = 30.
     * Example 2:
     * <p>
     * Input: ops = ["5","-2","4","C","D","9","+","+"]
     * Output: 27
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "-2" - Add -2 to the record, record is now [5, -2].
     * "4" - Add 4 to the record, record is now [5, -2, 4].
     * "C" - Invalidate and remove the previous score, record is now [5, -2].
     * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
     * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
     * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
     * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
     * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
     * Example 3:
     * <p>
     * Input: ops = ["1"]
     * Output: 1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= ops.length <= 1000
     * ops[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
     * For operation "+", there will always be at least two previous scores on the record.
     * For operations "C" and "D", there will always be at least one previous score on the record.
     *
     * @param ops
     * @return sum of all scores on the board
     */

    // Time Complexity = O(n), where N is the length of ops
    // Time Complexity = O(n), where N is the length of ops
    public int calPointsUsingStack(String[] ops) {

        Stack<Integer> st = new Stack<>();
        for (String str : ops) {
            if (str.equals("C")) {
                st.pop();
            } else if (str.equals("+")) {
                int topElem = st.pop();
                int secondElem = st.peek();
                int newTopElem = topElem + secondElem;
                st.push(topElem);
                st.push(newTopElem);
            } else if (str.equals("D")) {
                int topElem = st.peek();
                int newTop = topElem * 2;
                st.push(newTop);
            } else {
                st.push(Integer.parseInt(str));
            }
        }
        int res = 0;
        for (int n : st) {
            res += n;
        }
        return res;
    }

    // Time Complexity = O(n), where N is the length of ops
    // Time Complexity = O(n), where N is the length of ops
    public int calPointsUsingArrayList(String[] ops) {

        ArrayList<Integer> list = new ArrayList<>();

        int res = 0;
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                list.remove(index - 1);
                index--;
            } else if (ops[i].equals("D")) {
                res = list.get(index - 1) * 2;
                list.add(index++, res);
            } else if (ops[i].equals("+")) {
                res = list.get(index - 1) + list.get(index - 2);
                list.add(index++, res);
            } else {
                res = Integer.parseInt(ops[i]);
                list.add(index++, res);
            }
        }
        res = 0;
        for (int i : list) {
            res += i;
        }
        return res;
    }
}
