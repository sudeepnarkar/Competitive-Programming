package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/1/21, Fri, 9:57 PM
 **/

//https://leetcode.com/problems/largest-number-at-least-twice-of-others
public class LargestNumberAtLeastTwiceOfOthers {


    /**
     * In a given integer array nums, there is always exactly one largest element.
     * <p>
     * Find whether the largest element in the array is at least twice as much as every other number in the array.
     * <p>
     * If it is, return the index of the largest element, otherwise return -1.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3, 6, 1, 0]
     * Output: 1
     * Explanation: 6 is the largest integer, and for every other number in the array x,
     * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1, 2, 3, 4]
     * Output: -1
     * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
     * <p>
     * <p>
     * Note:
     * <p>
     * nums will have a length in the range [1, 50].
     * Every nums[i] will be an integer in the range [0, 99].
     *
     * @param nums
     * @return the index of the largest element, otherwise return -1.
     */

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    // TODO: Improve solution to do it in one pass
    public int dominantIndex(int[] nums) {

        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int n : nums) {
            if (n != max && max < 2 * n) {
                return -1;
            }
        }
        return index;
    }
}
