package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 1/24/2021, Sun, 2:18 PM
 **/

//https://leetcode.com/problems/find-median-from-data-stream
public class MedianFinder {


    /**
     * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
     * For example,
     * <p>
     * [2,3,4], the median is 3
     * <p>
     * [2,3], the median is (2 + 3) / 2 = 2.5
     * <p>
     * Design a data structure that supports the following two operations:
     * <p>
     * void addNum(int num) - Add a integer number from the data stream to the data structure.
     * double findMedian() - Return the median of all elements so far.
     * <p>
     * <p>
     * <p>
     * Example:
     * <p>
     * addNum(1)
     * addNum(2)
     * findMedian() -> 1.5
     * addNum(3)
     * findMedian() -> 2
     * <p>
     * <p>
     * <p>
     * Follow up:
     * <p>
     * If all integer numbers from the stream are between 0 and 100, how would you optimize it?
     * If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
     */


    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    //Time Complexity = O(5NLogN) ≈ O(NLogN), where the worst case is (5LogN) (3 heap insertions and 2 deletions) for every element added.
    //Space Complexity =  O(N)
    public void addNum(int num) {

        /**
         * The idea is to keep the lower half in the maxHeap
         * and the upper half in the minHeap.
         * The size of the maxHeap is equal to or 1 greater than
         * the size of the minHeap
         *
         */
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.remove());
        }
    }

    //Time Complexity = O(1)
    //Space Complexity = O(N)
    public double findMedian() {

        /**
         * When the size of the maxHeap and the minHeap
         * are equal, peek from both and calculate the median.
         * If not, the maxHeap top will have the median element
         */

        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return maxHeap.peek();
        }
    }
}
