package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/14/2021, Sun, 2:05 PM
 **/

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
public class FindMinimumInRotatedSortedArrayII {

    /**
     * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     * <p>
     * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
     * <p>
     * Find the minimum element.
     * <p>
     * The array may contain duplicates.
     * <p>
     * Example 1:
     * <p>
     * Input: [1,3,5]
     * Output: 1
     * <p>
     * Example 2:
     * <p>
     * Input: [2,2,2,0,1]
     * Output: 0
     * <p>
     * Note:
     * <p>
     * This is a follow up problem to Find Minimum in Rotated Sorted Array.
     * Would allow duplicates affect the run-time complexity? How and why?
     *
     * @param nums
     * @return the minimum element.
     */

    //Time Complexity = O(LogN), where N is the length of  nums
    //Space Complexity = O(1)
    public int findMin(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[high] == nums[mid] && (nums[mid] == nums[low])) {
                low++;
                high--;
            } else if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
