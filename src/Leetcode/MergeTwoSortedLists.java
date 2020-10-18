package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/18/2020, Sun, 7:33 PM
 **/

//https://leetcode.com/problems/merge-two-sorted-lists
public class MergeTwoSortedLists {

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
     * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Input: l1 = [1,2,4], l2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * Example 2:
     *
     * Input: l1 = [], l2 = []
     * Output: []
     * Example 3:
     *
     * Input: l1 = [], l2 = [0]
     * Output: [0]
     *
     */

    public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode prehead = new ListNode(-1000);
        ListNode curr = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }

        return prehead.next;
    }

    public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecursive(l1, l2.next);
            return l2;
        }
    }
}