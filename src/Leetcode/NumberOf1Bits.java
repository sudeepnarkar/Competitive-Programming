package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/24/2021, Sun, 3:39 PM
 **/

//https://leetcode.com/problems/number-of-1-bits
public class NumberOf1Bits {

    /**
     * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
     * <p>
     * Note:
     * <p>
     * Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
     * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3 above, the input represents the signed integer. -3.
     * <p>
     * Follow up: If this function is called many times, how would you optimize it?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 00000000000000000000000000001011
     * Output: 3
     * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 00000000000000000000000010000000
     * Output: 1
     * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
     * <p>
     * Example 3:
     * <p>
     * Input: n = 11111111111111111111111111111101
     * Output: 31
     * Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The input must be a binary string of length 32
     *
     * @param n
     * @return the number of '1' bits it has (also known as the Hamming weight).
     */


    //Time Complexity = O(1)
    //Space Complexity = O(1)
    // You need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;
        int i = 0;

        // It is a 32 bit unsigned int
        while (i < 32) {
            count += (n & 1);
            n = n >> 1;
            i++;
        }
        return count;
    }
}
