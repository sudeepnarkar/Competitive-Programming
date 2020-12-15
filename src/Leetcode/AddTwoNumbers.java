package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/18/2020, Sun, 8:51 PM
 **/

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

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
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Example 1:
     * <p>
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * Example 2:
     * <p>
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * Example 3:
     * <p>
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */

    // Time Complexity = O(max(M,N)) where M and N are the length of the two linked lists
    // Space Complexity = O(max(M,N))+1 where M and N are the length of the two linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // sentinal node
        ListNode head = new ListNode(-100);
        ListNode curr = head;
        int sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            sum = 0;
            sum += carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
        }
        // append the carry if present
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        return head.next;
    }
}
