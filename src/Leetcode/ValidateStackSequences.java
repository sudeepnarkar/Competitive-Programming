package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 3/16/21, Tue, 8:35 AM
 **/

//https://leetcode.com/problems/validate-stack-sequences
public class ValidateStackSequences {


    /**
     * Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
     * Output: true
     * Explanation: We might do the following sequence:
     * push(1), push(2), push(3), push(4), pop() -> 4,
     * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
     * Example 2:
     * <p>
     * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
     * Output: false
     * Explanation: 1 cannot be popped before 2.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= pushed.length == popped.length <= 1000
     * 0 <= pushed[i], popped[i] < 1000
     * pushed is a permutation of popped.
     * pushed and popped have distinct values.
     *
     * @param pushed
     * @param popped
     * @return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.
     */

    //Time Complexity = O(N+M), where N and M are the lengths of pushed and popped
    // Space Complexity = O(N+M), where N and M are the lengths of pushed and popped
    public boolean validateStackSequences(int[] pushed, int[] popped) {


        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            int push = pushed[i];
            st.push(push);
            //pop until the top element is the one in popped else push on to stack
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.size() == 0;
    }
}
