package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/14/2021, Sun, 1:03 PM
 **/

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii
public class SearchInRotatedSortedArrayII {

    /**
     * You are given an integer array nums sorted in ascending order (not necessarily distinct values), and an integer target.
     * <p>
     * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,4,4,5,6,6,7] might become [4,5,6,6,7,0,1,2,4,4]).
     * <p>
     * If target is found in the array return its index, otherwise, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,5,6,0,0,1,2], target = 0
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [2,5,6,0,0,1,2], target = 3
     * Output: false
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 5000
     * -104 <= nums[i] <= 104
     * nums is guaranteed to be rotated at some pivot.
     * -104 <= target <= 104
     *
     * @param nums
     * @param target
     * @return If target is found in the array return true, otherwise, return false;
     */

    //Time Complexity = O(LogN), where N is the length of nums
    //Space Complexity = O(1)
    public boolean search(int[] nums, int target) {

        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //check for duplicates. If true, we do not know which part is sorted so we decrement increase low and decrease high
            if ((nums[low] == nums[mid]) && (nums[high] == nums[mid])) {
                ++low;
                --high;
            }
            //check if left side is sorted
            else if (nums[mid] >= nums[low]) {
                // go left if the target is between low and mid else go right
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            //right side is sorted
            else {
                //go right if the target is between mid and high else go left
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
