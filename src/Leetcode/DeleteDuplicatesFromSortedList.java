package Leetcode;

public class DeleteDuplicatesFromSortedList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicatesFromSortedList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr != null && curr.next != null && curr.val == curr.next.val) {
            curr.next = curr.next.next;
        }

        head = curr;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
