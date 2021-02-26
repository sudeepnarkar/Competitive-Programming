package Leetcode;

import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 2/26/21, Fri, 10:40 AM
 **/

//https://leetcode.com/problems/merge-k-sorted-lists
public class MergeKSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
     * <p>
     * Merge all the linked-lists into one sorted linked-list and return it.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     * Example 2:
     * <p>
     * Input: lists = []
     * Output: []
     * Example 3:
     * <p>
     * Input: lists = [[]]
     * Output: []
     * <p>
     * <p>
     * Constraints:
     * <p>
     * k == lists.length
     * 0 <= k <= 10^4
     * 0 <= lists[i].length <= 500
     * -10^4 <= lists[i][j] <= 10^4
     * lists[i] is sorted in ascending order.
     * The sum of lists[i].length won't exceed 10^4.
     *
     * @param lists
     * @return sorted linked-list by merging all lists
     */


    //Time Complexity = O(N*M),where N is the size of the lists and M is the average size of the subList
    //Space Complexity = O(N*M),where N is the size of the lists and M is the average size of the subList
    public ListNode mergeKLists(ListNode[] lists) {

        /**
         * Create a min heap and add all the elements
         */

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            while (list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }

        ListNode dummy = new ListNode(-100);
        ListNode curr = dummy;

        /**
         * Pop the elements from a min heap and construct a new
         * linked list and return head
         */
        while (!minHeap.isEmpty()) {
            curr.next = new ListNode(minHeap.poll());
            curr = curr.next;
        }
        return dummy.next;
    }
}
