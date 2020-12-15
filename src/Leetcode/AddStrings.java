package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/15/2020, Tue, 2:38 PM
 **/

//https://leetcode.com/problems/add-strings
public class AddStrings {

    /**
     * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
     * <p>
     * Note:
     * <p>
     * The length of both num1 and num2 is < 5100.
     * Both num1 and num2 contains only digits 0-9.
     * Both num1 and num2 does not contain any leading zero.
     * You must not use any built-in BigInteger library or convert the inputs to integer directly.
     * Accepted
     *
     * @param num1
     * @param num2
     * @return string representing sum of num1 and num2.
     */

    // Time Complexity O(N+M) where N and M are the lengths of num1 and num2 respectively.
    // Space Complexity = 0(N) or O(M) based on the longest length
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            sum = 0;
            sum += carry;
            if (i >= 0) {
                sum += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j--) - '0';
            }
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }
}
