package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/7/21, Sun, 10:35 PM
 **/

//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
public class ConvertBinaryNumberInALinkedListToInteger {


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
     * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
     * <p>
     * Return the decimal value of the number in the linked list.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: head = [1,0,1]
     * Output: 5
     * Explanation: (101) in base 2 = (5) in base 10
     * Example 2:
     * <p>
     * Input: head = [0]
     * Output: 0
     * Example 3:
     * <p>
     * Input: head = [1]
     * Output: 1
     * Example 4:
     * <p>
     * Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
     * Output: 18880
     * Example 5:
     * <p>
     * Input: head = [0,0]
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The Linked List is not empty.
     * Number of nodes will not exceed 30.
     * Each node's value is either 0 or 1.
     *
     * @param head
     * @return the decimal value of the number in the linked list
     */

    //Time Complexity = O(N), where N is the length of the Linked List
    //Space Complexity = O(N), where N is the length of the Linked List
    public int getDecimalValue(ListNode head) {

        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        int pow = 0;
        int sum = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            sum += Math.pow(2, pow) * (Character.getNumericValue(sb.charAt(i)));
            pow++;
        }
        return sum;
    }
}
