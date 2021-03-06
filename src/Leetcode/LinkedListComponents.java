package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LinkedListComponents {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /*We are given head, the head node of a linked list containing unique integer values.

    We are also given the list G, a subset of the values in the linked list.

    Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.

            Example 1:

    Input:
    head: 0->1->2->3
    G = [0, 1, 3]
    Output: 2
    Explanation:
            0 and 1 are connected, so [0, 1] and [3] are the two connected components.
            Example 2:

    Input:
    head: 0->1->2->3->4
    G = [0, 3, 1, 4]
    Output: 2
    Explanation:
            0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
    */


    public static int numComponents(ListNode head, int[] G) {
        if (head == null) {
            return 0;
        }

               ArrayList<List<Integer>> list = new ArrayList<>();

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);

        HashSet<Integer> set = new HashSet<>();
        for (int n : G) {
            set.add(n);
        }
        int count = 0;
        int size = set.size();
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (set.contains(curr.val) && set.contains(curr.next.val)) {
                count++;
                size = size - 2;
            }
            curr = curr.next;
        }
        return count + size;
    }
}
