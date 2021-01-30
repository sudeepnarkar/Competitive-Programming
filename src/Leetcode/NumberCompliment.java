package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/30/21, Sat, 4:21 PM
 **/

//https://leetcode.com/problems/number-complement
public class NumberCompliment {

    /**
     * Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 5
     * Output: 2
     * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
     * Example 2:
     * <p>
     * Input: num = 1
     * Output: 0
     * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
     * num >= 1
     * You could assume no leading zero bit in the integer’s binary representation.
     * This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
     *
     * @param num
     * @return compliment number
     */

    //Time Complexity = O(1)
    //Space Complexity = O(1)
    public int findComplement(int num) {
        int res = 0;
        int pow = 1;
        while (num > 0) {
            res += (num % 2 ^ 1) * pow;
            pow <<= 1;
            num >>= 1;
        }
        return res;
    }
}
