package Leetcode;

//https://leetcode.com/problems/search-insert-position
public class SearchInsertPosition {
    
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     * <p>
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * Example 3:
     * <p>
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     * Example 4:
     * <p>
     * Input: nums = [1,3,5,6], target = 0
     * Output: 0
     * Example 5:
     * <p>
     * Input: nums = [1], target = 0
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums contains distinct values sorted in ascending order.
     * -104 <= target <= 104
     *
     * @param nums
     * @param target
     * @return insert position for the target
     */

    // Time Complexity = O(logn), as it is Binary Search
    // Space Compplexity = O(1), no extra space
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target <= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
