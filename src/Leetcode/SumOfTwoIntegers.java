package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/15/2020, Tue, 5:56 PM
 **/

//https://leetcode.com/problems/sum-of-two-integers
public class SumOfTwoIntegers {


    /**
     * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
     * <p>
     * Example 1:
     * <p>
     * Input: a = 1, b = 2
     * Output: 3
     * Example 2:
     * <p>
     * Input: a = -2, b = 3
     * Output: 1
     *
     * @param a
     * @param b
     * @return sum of a and b
     */
    // Time Complexity = O (1) as each integer contains 32 bits.
    // Space Complexity = O (1) as no additional space used
    public int getSum(int a, int b) {

        // XOR of a and b (a^b) will give answer without carry
        // left shift by 1 of AND of a and b  will give carry (a&b)<<1
        // keep adding the carry to the answer until carry is zero
        int answer = 0;
        while (b != 0) {
            // ans without carry
            answer = a ^ b;
            // generate carry
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        return answer;
    }
}
