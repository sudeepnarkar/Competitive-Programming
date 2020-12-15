package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/14/2020, Mon, 10:24 PM
 **/

//https://leetcode.com/problems/plus-one
public class PlusOne {

    /**
     * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
     * <p>
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     * <p>
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Example 3:
     * <p>
     * Input: digits = [0]
     * Output: [1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     *
     * @param digits
     * @return The array respresenting the sum
     */
    // Time Complexity = O (N) where N is the length of the digits array
    // Space Complexity = O (N)
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        int sum = 0;
        int carry = 1;
        int[] res = new int[i + 1];
        while (i >= 0) {
            sum = carry;
            sum += digits[i];
            res[i] = sum % 10;
            carry = sum / 10;
            i--;
        }
        // only create a new array if there is a carry
        if (carry == 1) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (i = 1; i < arr.length; i++) {
                arr[i] = res[i - 1];
            }
            return arr;
        }
        return res;
    }
}
