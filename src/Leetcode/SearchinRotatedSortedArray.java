package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/10/2021, Wed, 12:14 PM
 **/

//https://leetcode.com/problems/search-in-rotated-sorted-array
public class SearchinRotatedSortedArray {

    /**
     * You are given an integer array nums sorted in ascending order (with distinct values), and an integer target.
     * <p>
     * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
     * <p>
     * If target is found in the array return its index, otherwise, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 3
     * Output: -1
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1], target = 0
     * Output: -1
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 5000
     * -104 <= nums[i] <= 104
     * All values of nums are unique.
     * nums is guaranteed to be rotated at some pivot.
     * -104 <= target <= 104
     *
     * @param nums
     * @param target
     * @return index of target, if not present return -1
     */


    //Time Complexity = O(LogN), where N is length of nums
    //Space Complexity = O(1)
    public int search(int[] nums, int target) {

        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
                //check if left side is sorted
            } else if (nums[mid] >= nums[low]) {
                // go left if the target is betweeen low and mid else go right
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                //right side is sorted
            } else {
                //go right if the target is betweeen mid and high else go left
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
