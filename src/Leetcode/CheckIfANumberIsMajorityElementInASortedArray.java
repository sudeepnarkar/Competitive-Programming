package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/1/21, Fri, 5:11 PM
 **/

//https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array
public class CheckIfANumberIsMajorityElementInASortedArray {

    /**
     * Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.
     * <p>
     * A majority element is an element that appears more than N/2 times in an array of length N.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,4,5,5,5,5,5,6,6], target = 5
     * Output: true
     * Explanation:
     * The value 5 appears 5 times and the length of the array is 9.
     * Thus, 5 is a majority element because 5 > 9/2 is true.
     * Example 2:
     * <p>
     * Input: nums = [10,100,101,101], target = 101
     * Output: false
     * Explanation:
     * The value 101 appears 2 times and the length of the array is 4.
     * Thus, 101 is not a majority element because 2 > 4/2 is false.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 1000
     * 1 <= nums[i] <= 10^9
     * 1 <= target <= 10^9
     *
     * @param nums
     * @param target
     * @return True if and only if target is a majority element or return false;
     */

    // Time Complexity = O(logN)
    // Space Complexity = O(1)
    public boolean isMajorityElement(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                // target element found in nums
                // check the frequency of the target element
                return getFreq(mid, nums, target);
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    /**
     * Helper method to calculate the frequency of the target element
     *
     * @param index
     * @param nums
     * @param target
     * @return true if the target is a majority element or return false
     */

    public boolean getFreq(int index, int[] nums, int target) {

        int len = (nums.length / 2) + 1;
        int count = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
            // check if it is majority element by checking right end of the array
            if (len == count) {
                return true;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] == target) {
                count++;
            }
            // check if it is majority element by checking left end of the array
            if (len == count) {
                return true;
            }
        }
        return false;
    }
}
