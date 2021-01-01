package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/1/2021, Fri, 12:14 PM
 **/

//https://leetcode.com/problems/largest-subarray-length-k/submissions
public class LargestSubarrayLengthK {

    /**
     * An array A is larger than some array B if for the first index i where A[i] != B[i], A[i] > B[i].
     * <p>
     * For example, consider 0-indexing:
     * <p>
     * [1,3,2,4] > [1,2,2,4], since at index 1, 3 > 2.
     * [1,4,4,4] < [2,1,1,1], since at index 0, 1 < 2.
     * A subarray is a contiguous subsequence of the array.
     * <p>
     * Given an integer array nums of distinct integers, return the largest subarray of nums of length k.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,4,5,2,3], k = 3
     * Output: [5,2,3]
     * Explanation: The subarrays of size 3 are: [1,4,5], [4,5,2], and [5,2,3].
     * Of these, [5,2,3] is the largest.
     * Example 2:
     * <p>
     * Input: nums = [1,4,5,2,3], k = 4
     * Output: [4,5,2,3]
     * Explanation: The subarrays of size 4 are: [1,4,5,2], and [4,5,2,3].
     * Of these, [4,5,2,3] is the largest.
     * Example 3:
     * <p>
     * Input: nums = [1,4,5,2,3], k = 1
     * Output: [5]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= k <= nums.length <= 105
     * 1 <= nums[i] <= 109
     *
     * @param nums
     * @param k
     * @return
     */

    // Time Complexity = O(N), where N is the length of nums
    // Space Complexity = O(k), where k is the length of the result array
    public int[] largestSubarray(int[] nums, int k) {


        int[] res = new int[k];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            if (max < nums[i]) {
                maxIndex = i;
                max = nums[i];
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = nums[maxIndex++];
        }

        return res;
    }
}
