package Leetcode;

import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 1/17/2021, Sun, 8:50 PM
 **/

//https://leetcode.com/problems/minimum-cost-to-connect-sticks
public class MinimumCostToConnectSticks {

    /**
     * You have some number of sticks with positive integer lengths. These lengths are given as an array sticks, where sticks[i] is the length of the ith stick.
     * <p>
     * You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y. You must connect all the sticks until there is only one stick remaining.
     * <p>
     * Return the minimum cost of connecting all the given sticks into one stick in this way.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: sticks = [2,4,3]
     * Output: 14
     * Explanation: You start with sticks = [2,4,3].
     * 1. Combine sticks 2 and 3 for a cost of 2 + 3 = 5. Now you have sticks = [5,4].
     * 2. Combine sticks 5 and 4 for a cost of 5 + 4 = 9. Now you have sticks = [9].
     * There is only one stick left, so you are done. The total cost is 5 + 9 = 14.
     * <p>
     * Example 2:
     * <p>
     * Input: sticks = [1,8,3,5]
     * Output: 30
     * Explanation: You start with sticks = [1,8,3,5].
     * 1. Combine sticks 1 and 3 for a cost of 1 + 3 = 4. Now you have sticks = [4,8,5].
     * 2. Combine sticks 4 and 5 for a cost of 4 + 5 = 9. Now you have sticks = [9,8].
     * 3. Combine sticks 9 and 8 for a cost of 9 + 8 = 17. Now you have sticks = [17].
     * There is only one stick left, so you are done. The total cost is 4 + 9 + 17 = 30.
     * <p>
     * Example 3:
     * <p>
     * Input: sticks = [5]
     * Output: 0
     * Explanation: There is only one stick, so you don't need to do anything. The total cost is 0.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= sticks.length <= 104
     * 1 <= sticks[i] <= 104
     *
     * @param sticks
     * @return
     */

    //Time Complexity = O(NLogN), where N is the size of the sticks array
    //Space Complexity = O(N), where N is the size of the sticks array
    public int connectSticks(int[] sticks) {

        int sum = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
        for (int l : sticks) {
            minHeap.add(l);
        }

        while (minHeap.size() >= 2) {
            int bufferSum = minHeap.poll() + minHeap.poll();
            sum += bufferSum;
            minHeap.add(bufferSum);
        }

        return sum;
    }
}
