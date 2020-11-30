package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/28/20, Sat, 6:05 AM
 **/

//https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {

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
     * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
     * <p>
     * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
     * <p>
     * Example 1:
     * <p>
     * Input: 1->2->3->4->5->NULL
     * Output: 1->3->5->2->4->NULL
     * Example 2:
     * <p>
     * Input: 2->1->3->5->6->4->7->NULL
     * Output: 2->3->6->7->1->5->4->NULL
     *
     * @param head
     * @return head of the odd even linked list
     */

   // Time complexity = O(nodes) time
   // Space complexity = O (1)
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while (evenHead != null && evenHead.next != null) {
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = even;
        return head;
    }
}
