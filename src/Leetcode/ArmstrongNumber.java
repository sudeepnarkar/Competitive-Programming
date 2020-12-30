package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/29/20, Tue, 10:48 PM
 **/

//https://leetcode.com/problems/armstrong-number
public class ArmstrongNumber {

    /**
     * The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.
     * <p>
     * Given a positive integer N, return true if and only if it is an Armstrong number.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: 153
     * Output: true
     * Explanation:
     * 153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
     * Example 2:
     * <p>
     * Input: 123
     * Output: false
     * Explanation:
     * 123 is a 3-digit number, and 123 != 1^3 + 2^3 + 3^3 = 36.
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= N <= 10^8
     *
     * @param N
     * @return return true if and only if it is an Armstrong number.
     */

    // Time Complexity = O(M), where M is the number of digits in N
    // Space Complexity = O(1)
    public boolean isArmstrong(int N) {

        String str = String.valueOf(N);
        int k = str.length();
        int sum = 0;
        int tempNum = N;
        while (tempNum > 0) {
            int num = tempNum % 10;
            sum += Math.pow(num, k);
            tempNum /= 10;
        }
        return sum == N;
    }
}
