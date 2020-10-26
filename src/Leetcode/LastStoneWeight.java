package Leetcode;

import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 10/26/2020, Mon, 5:40 PM
 **/

//https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {

    /**
     * We have a collection of stones, each stone has a positive integer weight.
     * <p>
     * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
     * <p>
     * If x == y, both stones are totally destroyed;
     * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
     * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [2,7,4,1,8,1]
     * Output: 1
     * Explanation:
     * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
     * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
     * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
     * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
     */

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);

        for (int n : stones) {
            maxHeap.add(n);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if (stone1 > stone2) {
                maxHeap.add(stone1 - stone2);
            }
        }
        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
    }
}