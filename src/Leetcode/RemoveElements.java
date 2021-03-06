package Leetcode;

//https://leetcode.com/problems/remove-linked-list-elements
public class RemoveElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * Remove all elements from a linked list of integers that have value val.
     * <p>
     * Example:
     * <p>
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5
     *
     * @param head
     * @param val
     * @return
     */

    // Time Complexity = O(N), where N is the length of Linked List
    // Space Complexity = O(1)
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
