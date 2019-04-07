package Leetcode;

public class GetIntersectionNode {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

  /*  Write a program to find the node at which the intersection of two singly linked lists begins.

    For example, the following two linked lists:

    Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
    Output: Reference of the node with value = 8
    Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
    From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5].
    There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.*/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int len1 = findLen(headA);
        int len2 = findLen(headB);

        while (len1 > len2) {
            headA = headA.next;
            len1--;
        }
        while (len2 > len1) {
            headB = headB.next;
            len2--;
        }

        while (headA != null || headB != null) {

            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }

    public int findLen(ListNode head) {
        int count = 1;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

}
