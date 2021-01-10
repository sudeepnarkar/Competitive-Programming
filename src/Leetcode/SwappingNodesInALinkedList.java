package Leetcode;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 1/10/2021, Sun, 6:38 PM
 **/

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list
public class SwappingNodesInALinkedList {


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
     * You are given the head of a linked list, and an integer k.
     * <p>
     * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: head = [1,2,3,4,5], k = 2
     * Output: [1,4,3,2,5]
     * <p>
     * Example 2:
     * <p>
     * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
     * Output: [7,9,6,6,8,7,3,0,9,5]
     * <p>
     * Example 3:
     * <p>
     * Input: head = [1], k = 1
     * Output: [1]
     * <p>
     * Example 4:
     * <p>
     * Input: head = [1,2], k = 1
     * Output: [2,1]
     * <p>
     * Example 5:
     * <p>
     * Input: head = [1,2,3], k = 2
     * Output: [1,2,3]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the list is n.
     * 1 <= k <= n <= 105
     * 0 <= Node.val <= 100
     *
     * @param head
     * @param k
     * @return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed)
     */

    //Time Complexity = O(N)
    //Space Complexity = O(N)
    //TODO: Optimize solution for space complexity
    public ListNode swapNodes(ListNode head, int k) {


        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int size = list.size();
        int temp = list.get(k - 1);
        list.set(k - 1, list.get(size - k));
        list.set(size - k, temp);


        curr = new ListNode(-1);
        ListNode newHead = curr;
        for (int n : list) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }

        return newHead.next;
    }
}
