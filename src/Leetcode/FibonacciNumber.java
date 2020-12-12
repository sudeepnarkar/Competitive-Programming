package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/12/20, Sat, 12:52 PM
 **/

//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumber {


    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * <p>
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), for N > 1.
     * Given N, calculate F(N).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     * Example 2:
     * <p>
     * Input: 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     * Example 3:
     * <p>
     * Input: 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     *
     * @param N
     * @return fibonaci number
     */

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public int fibIterative(int N) {

        if (N <= 1) {
            return N;
        }

        int prev = 0;
        int curr = 1;
        int temp = 0;
        for (int i = 2; i <= N; i++) {
            temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }

    // Time Complexity = O(2^N)
    // Space Complexity = O(N)  - counting the recursion stack
    public int fibRecursive(int N) {
        if (N <= 1) {
            return N;
        }
        return fibRecursive(N - 1) + fibRecursive(N - 2);
    }
}
