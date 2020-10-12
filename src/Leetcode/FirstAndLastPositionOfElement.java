package Leetcode;

public class FirstAndLastPositionOfElement {
/*
    Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    Follow up: Could you write an algorithm with O(log n) runtime complexity?

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:

    Input: nums = [], target = 0*/

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
     * @return
     */
    public int getExtremeIndex(int nums[], int target, boolean findLeftIndex) {

        int low = 0;
        int high = nums.length;

        while (low < high) {
            int med = low + (high - low) / 2;
            if (target < nums[med] || (nums[med] == target && findLeftIndex)) {
                high = med;
            } else {
                low = med + 1;
            }
        }
        return low;
    }
}
