package Leetcode;

import org.junit.Assert;

import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 10/29/2020, Thu, 9:32 PM
 **/

//https://leetcode.com/problems/kth-largest-element-in-a-stream/
public class KthLargestElementInAStream {

    /**
     * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p>
     * Implement KthLargest class:
     * <p>
     * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
     * int add(int val) Returns the element representing the kth largest element in the stream.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input
     * ["KthLargest", "add", "add", "add", "add", "add"]
     * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
     * Output
     * [null, 4, 5, 5, 8, 8]
     * <p>
     * Explanation
     * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
     * kthLargest.add(3);   // return 4
     * kthLargest.add(5);   // return 5
     * kthLargest.add(10);  // return 5
     * kthLargest.add(9);   // return 8
     * kthLargest.add(4);   // return 8
     */


    PriorityQueue<Integer> minHeap = null;
    int k = 0;

    /**
     * Keep a minHeap of size K to have the Kth largest element at the top
     *
     * @param k
     * @param nums
     */
    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        while (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 8, 2};
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(3, nums);
        Assert.assertEquals(kthLargest.add(3), 4);   // return 4
        Assert.assertEquals(kthLargest.add(5), 5);   // return 5
        Assert.assertEquals(kthLargest.add(10), 5);  // return 5
        Assert.assertEquals(kthLargest.add(9), 8);   // return 8
        Assert.assertEquals(kthLargest.add(4), 8);   // return 8
    }
}
