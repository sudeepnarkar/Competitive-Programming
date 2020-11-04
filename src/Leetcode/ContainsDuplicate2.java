package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/3/2020, Tue, 9:12 PM
 **/

//https://leetcode.com/problems/contains-duplicate-ii
public class ContainsDuplicate2 {

    /**
     * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in
     * the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,0,1,1], k = 1
     * Output: true
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1,2,3,1,2,3], k = 2
     * Output: false
     */

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                int diff = i - j;
                if (diff <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
