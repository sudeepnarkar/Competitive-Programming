package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 1/17/2021, Sun, 5:42 PM
 **/

//https://leetcode.com/problems/copy-list-with-random-pointer
public class CopyListWithRandomPointer {


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
     * <p>
     * Return a deep copy of the list.
     * <p>
     * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
     * <p>
     * val: an integer representing Node.val
     * random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * <p>
     * Example 2:
     * <p>
     * Input: head = [[1,1],[2,1]]
     * Output: [[1,1],[2,1]]
     * <p>
     * Example 3:
     * <p>
     * Input: head = [[3,null],[3,0],[3,null]]
     * Output: [[3,null],[3,0],[3,null]]
     * <p>
     * Example 4:
     * <p>
     * Input: head = []
     * Output: []
     * Explanation: Given linked list is empty (null pointer), so return null.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * -10000 <= Node.val <= 10000
     * Node.random is null or pointing to a node in the linked list.
     * The number of nodes will not exceed 1000.
     *
     * @param head
     * @return
     */

    //Time Complexity = O(N), where N is the number of nodes in the LinkedList
    //Space Complexity = O(N), where N is the number of nodes in the LinkedList
    public Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        //create a map with node copies in first pass
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        //Add next and random pointers in the second pass
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
