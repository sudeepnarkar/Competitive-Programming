package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/5/2020, Sat, 1:41 PM
 **/

//https://leetcode.com/problems/powx-n
public class PowerFunction {


    /**
     * Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 2.00000, n = 10
     * Output: 1024.00000
     * <p>
     * Example 2:
     * <p>
     * Input: x = 2.10000, n = 3
     * Output: 9.26100
     * <p>
     * Example 3:
     * <p>
     * Input: x = 2.00000, n = -2
     * Output: 0.25000
     * Explanation: 2-2 = 1/22 = 1/4 = 0.25
     *
     * @param x
     * @param n
     * @return
     */

    // Time complexity =  O(log n)
    // Space complexity = O (1) i.e - ignoring the recursion stack. Including recursion stack it will be O(log n)
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        // Handle Interger overflow case
        if (n == Integer.MIN_VALUE) {
            // for large n -> Integer.MIN_VALUE the result is going to be zero.
            n = n + 2;
        }
        // Handle negative n case
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
