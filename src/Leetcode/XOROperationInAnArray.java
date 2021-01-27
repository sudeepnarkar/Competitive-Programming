package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/26/2021, Tue, 9:15 PM
 **/

//https://leetcode.com/problems/xor-operation-in-an-array
public class XOROperationInAnArray {

    /**
     * Given an integer n and an integer start.
     * <p>
     * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
     * <p>
     * Return the bitwise XOR of all elements of nums.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 5, start = 0
     * Output: 8
     * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
     * Where "^" corresponds to bitwise XOR operator.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 4, start = 3
     * Output: 8
     * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
     * <p>
     * Example 3:
     * <p>
     * Input: n = 1, start = 7
     * Output: 7
     * <p>
     * Example 4:
     * <p>
     * Input: n = 10, start = 5
     * Output: 2
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 1000
     * 0 <= start <= 1000
     * n == nums.length
     *
     * @param n
     * @param start
     * @return the bitwise XOR of all elements of nums.
     */

    //Time Complexity = O(N)
    //Time Complexity = O(N)
    //TODO : Optimize the time complexity and write a O(1) solution
    public int xorOperation(int n, int start) {

        int res = start;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            res ^= nums[i];
        }

        return res;
    }
}
