package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 3/2/21, Tue, 10:34 AM
 **/

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
public class RemoveDuplicatesFromSortedListII {


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


    //Time Complexity - O(N), where N is the size of the List
    //Space Complexity - O(N), where N is the size of the List
    //TODO: Do it O(1) without extra space
    public ListNode deleteDuplicates(ListNode head) {

        Set<Integer> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            //store duplicates in set
            if (curr.val == curr.next.val) {
                set.add(curr.val);
            }
            curr = curr.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr1 = dummy;
        curr = head;
        while (curr != null) {
            //create a list without duplicates
            if (!set.contains(curr.val)) {
                curr1.next = new ListNode(curr.val);
                curr1 = curr1.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }


}
