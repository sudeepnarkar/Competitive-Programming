package Leetcode.PalindromeLinkedList;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/10/2020, Tue, 6:55 AM
 **/

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Given a singly linked list, determine if it is a palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: 1->2
     * Output: false
     * <p>
     * Example 2:
     * <p>
     * Input: 1->2->2->1
     * Output: true
     */

    public static boolean isPalindrome(ListNode head) {

        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            st.push(curr);
            curr = curr.next;
        }

        while (!st.isEmpty() || head != null) {
            if (st.pop().val != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
