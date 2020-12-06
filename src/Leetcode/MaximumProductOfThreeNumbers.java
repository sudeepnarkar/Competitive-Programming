package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 12/6/2020, Sun, 12:17 PM
 **/

//https://leetcode.com/problems/maximum-product-of-three-numbers
public class MaximumProductOfThreeNumbers {

    /**
     * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3]
     * Output: 6
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: 24
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [-1,-2,-3]
     * Output: -6
     *
     * @param nums
     * @return Maximum Product of Three Numbers
     */


    // Time Complexity = O (NlogN)
    // Space Complexity = O (1)
    public int maximumProduct(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
    }

  // Time complexity = O(NlogK) where K = 3 but K is constant and does not scale with N so the answer is O(N)
  // Space Complexity = O (5) to store 5 elements in the heap which does not scale so it is O(1)
    public int maximumProductUsingHeaps(int[] nums) {
        PriorityQueue<Integer> posHeap = new PriorityQueue<>();
        PriorityQueue<Integer> neHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            posHeap.offer(num);
            neHeap.offer(num);
            if (posHeap.size() > 3) {
                posHeap.poll();
            }
            if (neHeap.size() > 2) {
                neHeap.poll();
            }
        }
        int posMax = 1;
        int max = 0;
        while (!posHeap.isEmpty()) {
            max = posHeap.poll();
            posMax *= max;
        }
        while (!neHeap.isEmpty()) {
            max *= neHeap.poll();
        }
        return Math.max(posMax, max);
    }
}
