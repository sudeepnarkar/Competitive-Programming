package Leetcode;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class FirstAndLastPositionOfElement {
    /**
     * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
     * <p>
     * If target is not found in the array, return [-1, -1].
     * <p>
     * Follow up: Could you write an algorithm with O(log n) runtime complexity?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * nums is a non-decreasing array.
     * -109 <= target <= 109
     *
     * @param nums
     * @param target
     * @return an array of left and right extreme index of the target in the array
     */

    //Time Complexity = O(logN), where N is the length of nums
    //Space Complexity = O(1)
    public int[] searchRange(int[] nums, int target) {

        int indexLeft = getExtremeIndex(nums, target, true);
        int[] res = new int[]{-1, -1};

        if (indexLeft == nums.length || nums[indexLeft] != target) {
            return res;
        }
        res[0] = indexLeft;
        int indexRight = getExtremeIndex(nums, target, false) - 1;
        res[1] = indexRight;
        return res;
    }

    /**
     * Get the leftmost or rightmost index of the target
     * based findLeftIndex flag
     *
     * @param nums
     * @param target
     * @param findLeftIndex
     * @return  left or the right extreme index value for the target based on findLeftIndex
     */
    public int getExtremeIndex(int nums[], int target, boolean findLeftIndex) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int med = low + (high - low) / 2;
            if (target < nums[med] || (nums[med] == target && findLeftIndex)) {
                high = med - 1;
            } else {
                low = med + 1;
            }
        }
        return low;
    }
}
