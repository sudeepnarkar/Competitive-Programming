package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/31/20, Thu, 6:34 PM
 **/

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    /**
     * You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
     * <p>
     * Notice that x does not have to be an element in nums.
     * <p>
     * Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3,5]
     * Output: 2
     * Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
     * Example 2:
     * <p>
     * Input: nums = [0,0]
     * Output: -1
     * Explanation: No numbers fit the criteria for x.
     * If x = 0, there should be 0 numbers >= x, but there are 2.
     * If x = 1, there should be 1 number >= x, but there are 0.
     * If x = 2, there should be 2 numbers >= x, but there are 0.
     * x cannot be greater since there are only 2 numbers in nums.
     * Example 3:
     * <p>
     * Input: nums = [0,4,3,0,4]
     * Output: 3
     * Explanation: There are 3 values that are greater than or equal to 3.
     * Example 4:
     * <p>
     * Input: nums = [3,6,7,7,0]
     * Output: -1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 0 <= nums[i] <= 1000
     *
     * @param nums
     * @return
     */

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    //TODO: Improve time complexity
    public int specialArray(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }

        return -1;
    }
}