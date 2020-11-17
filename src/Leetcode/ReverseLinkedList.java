package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/16/2020, Mon, 8:45 PM
 **/

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * Reverse a singly linked list.
     * <p>
     * Example:
     * <p>
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     *
     * @param head
     * @return Head of the reversed linked list
     */

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
