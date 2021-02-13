package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 2/12/21, Fri, 8:51 PM
 **/

//https://leetcode.com/problems/sort-array-by-increasing-frequency
public class SortArrayByIncreasingFrequency {

    /**
     * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
     * <p>
     * Return the sorted array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,2,2,2,3]
     * Output: [3,1,1,2,2,2]
     * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
     * Example 2:
     * <p>
     * Input: nums = [2,3,1,3,2]
     * Output: [1,3,3,2,2]
     * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
     * Example 3:
     * <p>
     * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
     * Output: [5,-1,4,4,-6,-6,1,1,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * -100 <= nums[i] <= 100
     *
     * @param nums
     * @return the sorted array based on the conditons
     */

    //Time Complexity = O(NlogN), where N is the length of nums
    //Space Complexity = O(N), where N is the length of nums
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        //sorting condition implementation
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>
                ((e1, e2) -> e1.getValue() == e2.getValue() ? e2.getKey() - e1.getKey() : e1.getValue() - e2.getValue());

        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            pq.add(e);
        }

        int[] resArr = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            int freq = pq.peek().getValue();
            int key = pq.peek().getKey();
            pq.poll();
            for (int i = 0; i < freq; i++) {
                resArr[index++] = key;
            }
        }
        return resArr;
    }
}
