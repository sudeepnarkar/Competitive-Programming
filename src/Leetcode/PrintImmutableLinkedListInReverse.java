package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 4/9/21, Fri, 8:12 PM
 **/

//https://leetcode.com/problems/print-immutable-linked-list-in-reverse
public class PrintImmutableLinkedListInReverse {

    interface ImmutableListNode {
        public void printValue(); // print the value of this node.

        public ImmutableListNode getNext(); // return the next node.
    }

    /**
     * You are given an immutable linked list, print out all values of each node in reverse with the help of the following interface:
     * <p>
     * ImmutableListNode: An interface of immutable linked list, you are given the head of the list.
     * You need to use the following functions to access the linked list (you can't access the ImmutableListNode directly):
     * <p>
     * ImmutableListNode.printValue(): Print value of the current node.
     * ImmutableListNode.getNext(): Return the next node.
     * The input is only given to initialize the linked list internally. You must solve this problem without modifying the linked list. In other words, you must operate the linked list using only the mentioned APIs.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: head = [1,2,3,4]
     * Output: [4,3,2,1]
     * Example 2:
     * <p>
     * Input: head = [0,-4,-1,3,-5]
     * Output: [-5,3,-1,-4,0]
     * Example 3:
     * <p>
     * Input: head = [-2,0,6,4,4,-6]
     * Output: [-6,4,4,6,0,-2]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The length of the linked list is between [1, 1000].
     * The value of each node in the linked list is between [-1000, 1000].
     *
     * @param head
     */

    //Time Complexity = O(N), where N is the length of the linked list
    //Space Complexity = O(N), where N is the length of the linked list
    public void printLinkedListInReverse(ImmutableListNode head) {

        Stack<ImmutableListNode> st = new Stack<>();

        while (head != null) {
            st.push(head);
            head = head.getNext();
        }

        while (st.size() != 0) {
            st.pop().printValue();
        }
    }
}
