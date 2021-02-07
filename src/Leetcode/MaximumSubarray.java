package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 9:58 PM
 **/

//https://leetcode.com/problems/maximum-subarray
public class MaximumSubarray {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * <p>
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Example 2:
     * <p>
     * Input: nums = [1]
     * Output: 1
     * Example 3:
     * <p>
     * Input: nums = [0]
     * Output: 0
     * Example 4:
     * <p>
     * Input: nums = [-1]
     * Output: -1
     * Example 5:
     * <p>
     * Input: nums = [-2147483647]
     * Output: -2147483647
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length == 0){
            throw  new IllegalArgumentException("Input array is empty or null");
        }

        int max = nums[0];
        int maxTillHere = nums[0];

        /**
         * Kadane's Algorithm:
         * Max sum at index i is max of nums[i] and maxSoFar + nums[i]
         * Keep track of max in max variable
         */
        for (int i = 1; i < nums.length; i++) {
            maxTillHere = Math.max(maxTillHere + nums[i], nums[i]);
            max = Math.max(max, maxTillHere);
        }

        return max;
    }
}
