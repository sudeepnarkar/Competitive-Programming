package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/10/2021, Sun, 5:33 PM
 **/

//https://leetcode.com/problems/perfect-number
public class PerfectNumber {

    /**
     * A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
     * <p>
     * Given an integer n, return true if n is a perfect number, otherwise return false.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 28
     * Output: true
     * Explanation: 28 = 1 + 2 + 4 + 7 + 14
     * 1, 2, 4, 7, and 14 are all divisors of 28.
     * <p>
     * Example 2:
     * <p>
     * Input: num = 6
     * Output: true
     * <p>
     * Example 3:
     * <p>
     * Input: num = 496
     * Output: true
     * <p>
     * Example 4:
     * <p>
     * Input: num = 8128
     * Output: true
     * <p>
     * Example 5:
     * <p>
     * Input: num = 2
     * Output: false
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= num <= 108
     *
     * @param num
     * @return true if n is a perfect number, otherwise return false.
     */

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public boolean checkPerfectNumber(int num) {

        if (num == 1) {
            return false;
        }

        int count = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += i;
                count += num / i;
            }
            if (count > num) {
                return false;
            }
        }
        return count == num;
    }
}
