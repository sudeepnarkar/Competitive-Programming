package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/4/2021, Thu, 9:54 PM
 **/

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray
public class ShortestUnsortedContinuousSubarray {

    /**
     * Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
     * <p>
     * Return the shortest such subarray and output its length.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,6,4,8,10,9,15]
     * Output: 5
     * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: 0
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1]
     * Output: 0
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -105 <= nums[i] <= 105
     *
     * @param nums
     * @return the length of the shortest unsorted sub-array
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int findUnsortedSubarray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        //Find the dip
        for (start = 0; start < nums.length - 1; start++) {
            if (nums[start + 1] < nums[start]) {
                break;
            }
        }
        if (start == nums.length - 1) {
            return 0;
        }

        //Find the bump
        for (end = nums.length - 1; end > 0; end--) {
            if (nums[end - 1] > nums[end]) {
                break;
            }
        }

        //Get the min and max of the subarray
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int k = start; k <= end; k++) {
            min = Math.min(min, nums[k]);
            max = Math.max(max, nums[k]);
        }

        //Traverse out of dip and bump to see if the unsorted array can be expanded
        while (start > 0 && nums[start - 1] > min) {
            start--;
        }

        while (end < nums.length - 1 && nums[end + 1] < max) {
            end++;
        }

        return (end - start + 1);
    }
}
