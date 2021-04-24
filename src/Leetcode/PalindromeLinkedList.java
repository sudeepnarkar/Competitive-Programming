package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 4/24/21, Sat, 8:42 AM
 **/

//https://leetcode.com/problems/palindrome-linked-list
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

    //Time Complexity = O(N), where N is the length of the linked list
    //Space Complexity = O(N), where N is the length of the linked list
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
