package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/8/2020, Tue, 9:41 AM
 **/

//https://leetcode.com/problems/move-zeroes
public class MoveZeroes {

    /**
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Example:
     * <p>
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * <p>
     * Note:
     * <p>
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     *
     * @param nums
     */

    // Time Complexity = 0(N)
    // Space complexity = O(1)
    public void moveZeroes(int[] nums) {
         /*
         Move non-zero numbers in the array forward
         Fill the remainder with zeroes
         */
        int index = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[index++] = n;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
