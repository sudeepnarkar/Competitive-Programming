package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 2/13/2021, Sat, 6:09 PM
 **/

//https://leetcode.com/problems/maximum-size-subarray-sum-equals-k
public class MaximumSizeSubarraySumEqualsk {

    /**
     * Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.
     * <p>
     * Note:
     * The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1, -1, 5, -2, 3], k = 3
     * Output: 4
     * Explanation: The subarray [1, -1, 5, -2] sums to 3 and is the longest.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [-2, -1, 2, 1], k = 1
     * Output: 2
     * Explanation: The subarray [-1, 2] sums to 1 and is the longest.
     * <p>
     * Follow Up:
     * Can you do it in O(n) time?
     *
     * @param nums
     * @param k
     * @return the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(N), where N is the length of nums
    public int maxSubArrayLen(int[] nums, int k) {

        //store the sum until index i in nums[i]
        // sum from index i to j is nums[j] - nums[i-1] except when i = 0 then sum is nums[j]
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        //store the sum at index in map <sum, index>
        map.put(0, -1); // entry for sum from O to j
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                max = Math.max(max, i - map.get(nums[i] - k));
            }
            //store the left most index of sum only to get max subarray
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        return max;
    }
}



