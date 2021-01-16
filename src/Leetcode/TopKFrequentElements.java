package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 10/26/2020, Mon, 9:43 AM
 **/

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {


    /**
     * Given a non-empty array of integers, return the k most frequent elements.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * Example 2:
     * <p>
     * Input: nums = [1], k = 1
     * Output: [1]
     * Note:
     * <p>
     * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
     * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     * It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
     * You can return the answer in any order.
     */


    //Time Complexity = O(NlogN), where N is the length of nums
    //Space Complexity = O(N), where N is the length of nums
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n2) - map.get(n1));

        for (int n : map.keySet()) {
            heap.add(n);
        }

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = heap.poll();
        }
        return arr;
    }
}
