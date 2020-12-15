package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/14/2020, Mon, 7:02 PM
 **/

//https://leetcode.com/problems/add-binary
public class AddBinary {

    /**
     * Given two binary strings a and b, return their sum as a binary string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= a.length, b.length <= 104
     * a and b consist only of '0' or '1' characters.
     * Each string does not contain leading zeros except for the zero itself.
     *
     * @param a
     * @param b
     * @return the sum of a and b as a binary string.
     */

    // Time Complexity O(N) where N is the length of the longest string
    // Space Complexity = O(N)
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            sum = 0;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sum += carry;
            // insert at the beginning
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        // If the carry is still one, then add at the beginning
        if (carry == 1) {
            // insert at the beginning
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
