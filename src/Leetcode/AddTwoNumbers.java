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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;
        int sum = 0;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            sum = sum > 9 ? 1 : 0;
            curr = curr.next;
        }
        if (sum == 1) {
            curr.next = new ListNode(1);
        }

        return preHead.next;
    }
}