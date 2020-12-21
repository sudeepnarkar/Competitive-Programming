package Leetcode;

import java.sql.Time;
import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/21/20, Mon, 11:38 AM
 **/

//https://leetcode.com/problems/subarray-sum-equals-k
public class SubarraySumEqualsK {

    /**
     * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     * Example 2:
     * <p>
     * Input: nums = [1,2,3], k = 3
     * Output: 2
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 2 * 104
     * -1000 <= nums[i] <= 1000
     * -107 <= k <= 107
     *
     * @param nums
     * @param k
     * @return the total number of continuous subarrays whose sum equals to k
     */

    //Time Complexity = O(N), where N is the length of nums array
    // Space Complexity k= O(N), where N is the length of nums array
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (preSumMap.containsKey(runningSum - k)) {
                count += preSumMap.get(runningSum - k);
            }
            preSumMap.put(runningSum, preSumMap.getOrDefault(runningSum, 0) + 1);
        }
        return count;
    }
}
