package Leetcode;

//https://leetcode.com/problems/valid-perfect-square
public class ValidPerfectSquare {


    /**
     * Given a positive integer num, write a function which returns True if num is a perfect square else False.
     * <p>
     * Follow up: Do not use any built-in library function such as sqrt.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 16
     * Output: true
     * Example 2:
     * <p>
     * Input: num = 14
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= num <= 2^31 - 1
     *
     * @param num
     * @return
     */

    // Time Complexity = O(LogN)
    // Space Complexity = O(1)
    public boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long guess = mid * mid;
            if (guess == num) {
                return true;
            } else if (num > guess) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
