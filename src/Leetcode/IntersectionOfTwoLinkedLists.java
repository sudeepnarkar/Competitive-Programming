package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/1/21, Fri, 4:30 PM
 **/

//https://leetcode.com/problems/intersection-of-two-linked-lists
public class IntersectionOfTwoLinkedLists {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * <p>
     * For example, the following two linked lists:
     * <p>
     * <p>
     * begin to intersect at node c1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
     * Output: Reference of the node with value = 8
     * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
     * <p>
     * <p>
     * Example 2:
     * <p>
     * <p>
     * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
     * Output: Reference of the node with value = 2
     * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
     * <p>
     * <p>
     * Example 3:
     * <p>
     * <p>
     * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
     * Output: null
     * Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
     * Explanation: The two lists do not intersect, so return null.
     * <p>
     * <p>
     * Notes:
     * <p>
     * If the two linked lists have no intersection at all, return null.
     * The linked lists must retain their original structure after the function returns.
     * You may assume there are no cycles anywhere in the entire linked structure.
     * Each value on each linked list is in the range [1, 10^9].
     * Your code should preferably run in O(n) time and use only O(1) memory.
     *
     * @param headA
     * @param headB
     * @return node at which the intersection of two singly linked lists begins.
     */

    //Time Complexity = O(N+M)
    //Space Complexity = O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //Get the lengths of the lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        //Get the heads of the lists at the same start points
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenA < lenB) {
            headB = headB.next;
            lenB--;
        }

        // Increment until the intersection is not found
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        //return either headA or headB which is the intersection
        return headA;
    }

    public int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
