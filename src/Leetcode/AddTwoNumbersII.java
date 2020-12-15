package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 12/15/2020, Tue, 5:30 PM
 **/

//https://leetcode.com/problems/add-two-numbers-ii
public class AddTwoNumbersII {

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
     * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Follow up:
     * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
     * <p>
     * Example:
     * <p>
     * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 8 -> 0 -> 7
     *
     * @param l1
     * @param l2
     * @return the addition of the two numbers as a linked list
     */

    //Time Complexity = O(max(N, M)) where N and M are the lengths of the two linked lists
    //Space Complexity = O(N+M) where N and M are the lengths of the two linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        ListNode curr = null;
        int sum = 0;
        int carry = 0;
        while (!st1.isEmpty() || !st2.isEmpty()) {
            sum = 0;
            sum += carry;
            if (!st1.isEmpty()) {
                sum += st1.pop();
            }
            if (!st2.isEmpty()) {
                sum += st2.pop();
            }
            ListNode node = new ListNode(sum % 10);
            node.next = curr;
            curr = node;
            carry = sum / 10;
        }

        if (carry == 1) {
            ListNode node = new ListNode(1);
            node.next = curr;
            curr = node;
        }

        return curr;

    }
}
