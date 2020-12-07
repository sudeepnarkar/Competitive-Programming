package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/6/2020, Sun, 8:01 PM
 **/

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    /**
     * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 234
     * Output: 15
     * Explanation:
     * Product of digits = 2 * 3 * 4 = 24
     * Sum of digits = 2 + 3 + 4 = 9
     * Result = 24 - 9 = 15
     * <p>
     * Example 2:
     * <p>
     * Input: n = 4421
     * Output: 21
     * Explanation:
     * Product of digits = 4 * 4 * 2 * 1 = 32
     * Sum of digits = 4 + 4 + 2 + 1 = 11
     * Result = 32 - 11 = 21
     *
     * @param n
     * @return result of subtraction of the Product and Sum of Digits of an Integer
     */

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public int subtractProductAndSum(int n) {
        long[] res = new long[2];
        res = calculate(n);
        return (int) (res[1] - res[0]);
    }

    public long[] calculate(int n) {
        long sum = 0;
        long product = 1;
        while (n > 0) {
            int a = n % 10;
            sum += a;
            product *= a;
            n /= 10;
        }
        return new long[]{sum, product};
    }
}
