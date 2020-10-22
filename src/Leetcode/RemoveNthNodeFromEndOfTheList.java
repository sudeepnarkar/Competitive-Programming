package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/21/2020, Wed, 9:40 PM
 **/
//https://leetcode.com/problems/remove-nth-node-from-end-of-list
public class RemoveNthNodeFromEndOfTheList {

    /**
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     * <p>
     * Follow up: Could you do this in one pass?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * Example 2:
     * <p>
     * Input: head = [1], n = 1
     * Output: []
     * Example 3:
     * <p>
     * Input: head = [1,2], n = 1
     * Output: [1]
     */

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


    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode preHead = new ListNode(-100);
        preHead.next = head;
        ListNode slow = preHead;
        ListNode fast = preHead;
        int index = 0;

        //create a gap on n elements between slow and fast pointers.
        while (index < n) {
            if (fast != null) {
                fast = fast.next;
            }
            index++;
        }

        // technically this is not one pass but 2O(N) is O(N) or linear time in terms of time complexity
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return preHead.next;
    }
}


