package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/10/2021, Sun, 11:41 AM
 **/

//https://leetcode.com/problems/sqrtx
public class SqrtOfX {

    /**
     * Given a non-negative integer x, compute and return the square root of x.
     * <p>
     * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 4
     * Output: 2
     * <p>
     * Example 2:
     * <p>
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
     *
     * @param x
     * @return compute and return the square root of x.
     */

    //Time Complexity = O(LogX)
    //Space Commplexity = O(1)
    public int mySqrt(int x) {

        if (x == 1) {
            return 1;
        }
        int low = 1;
        int high = x / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
