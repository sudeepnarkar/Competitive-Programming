package Leetcode;

import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 10/25/2020, Sun, 8:15 PM
 **/
//https://leetcode.com/problems/happy-number/
public class HappyNumber {

    /**
     * Write an algorithm to determine if a number n is "happy".
     * <p>
     * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
     * <p>
     * Return True if n is a happy number, and False if not.
     * <p>
     * Example:
     * <p>
     * Input: 19
     * Output: true
     * Explanation:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     */


    public boolean isHappy(int n) {
        int sum = 0;
        int curr = 0;
        HashSet<Integer> seen = new HashSet<>();
        // to check if we are entering into a cycle. If yes, it is an infinite cycle and it is not a happy number
        while (!seen.contains(n)) {
            seen.add(n);
            sum = 0;
            while (n > 0) {
                curr = n % 10;
                sum += Math.pow(curr, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }
}