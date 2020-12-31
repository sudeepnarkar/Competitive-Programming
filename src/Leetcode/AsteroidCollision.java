package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 12/30/2020, Wed, 5:46 PM
 **/

//https://leetcode.com/problems/asteroid-collision
public class AsteroidCollision {


    /**
     * We are given an array asteroids of integers representing asteroids in a row.
     * <p>
     * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
     * <p>
     * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: asteroids = [5,10,-5]
     * Output: [5,10]
     * Explanation: The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.
     * Example 2:
     * <p>
     * Input: asteroids = [8,-8]
     * Output: []
     * Explanation: The 8 and -8 collide exploding each other.
     * Example 3:
     * <p>
     * Input: asteroids = [10,2,-5]
     * Output: [10]
     * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
     * Example 4:
     * <p>
     * Input: asteroids = [-2,-1,1,2]
     * Output: [-2,-1,1,2]
     * Explanation: The -2 and -1 are moving left, while the 1 and 2 are moving right. Asteroids moving the same direction never meet, so no asteroids will meet each other.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= asteroids <= 104
     * -1000 <= asteroids[i] <= 1000
     * asteroids[i] != 0
     *
     * @param asteroids
     * @return the state of asteriods after collision
     */

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public int[] asteroidCollision(int[] asteroids) {

        /**
         * Case 1: The current number is positive, push onto stack
         * Case 2: If the current number is negative, it can be one of the following cases:
         *       Case 2.1 : If the top is positive and greater than the absolute of current number, pop from stack
         *       Case 2.1 : If the top is negative, push onto stack
         *       Case 2.1 : If the top is equal to current, pop from stack
         */

        Stack<Integer> st = new Stack<>();
        for (int n : asteroids) {
            if (n > 0) {
                st.push(n);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(n)) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(n);
                } else if (n + st.peek() == 0) {
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            res[i--] = st.pop();
        }
        return res;
    }
}
