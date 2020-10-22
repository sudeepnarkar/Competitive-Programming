package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/21/2020, Wed, 11:23 PM
 **/

//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {

    /**
     * Given an integer n, write a function to determine if it is a power of two.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 1
     * Output: true
     * Explanation: 20 = 1
     * Example 2:
     * <p>
     * Input: n = 16
     * Output: true
     * Explanation: 24 = 16
     * Example 3:
     * <p>
     * Input: n = 3
     * Output: false
     * Example 4:
     * <p>
     * Input: n = 4
     * Output: true
     * Example 5:
     * <p>
     * Input: n = 5
     * Output: false
     */
    
    public boolean isPowerOfTwo(int n) {

        long powerOfTwo = 1;
        while (powerOfTwo < n) {
            powerOfTwo *= 2;
        }
        return powerOfTwo == n;
    }
}