package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/12/20, Sat, 1:50 PM
 **/

//https://leetcode.com/problems/climbing-stairs
public class ClimbingStairs {

    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     * <p>
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     * <p>
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 45
     *
     * @param n
     * @return distinct way to climb to the top
     */
    // Time Complexity = O(N)
    // Space Complexity  = O(N+1) = O (N)
    public int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
