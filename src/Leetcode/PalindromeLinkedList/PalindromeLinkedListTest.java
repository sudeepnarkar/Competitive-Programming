package Leetcode.PalindromeLinkedList;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeLinkedListTest {

    PalindromeLinkedList.ListNode head;

    public void insertNode(int data) {

        PalindromeLinkedList.ListNode node = new PalindromeLinkedList.ListNode(data);
        if (head == null) {
            head = node;
        } else {
            PalindromeLinkedList.ListNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }


    @Test
    public void isPalindromeTestForPalindromeLinkedList() {
        //define the linked list values
        int[] arr = new int[]{1, 2, 2, 1};
        for (int el : arr) {
            insertNode(el);
        }
        assertEquals(true, PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindromeTestForNonPalindromeLinkedList() {
        //define the linked list values
        int[] arr = new int[]{1, 2, 1, 1};
        for (int el : arr) {
            insertNode(el);
        }
        assertEquals(false, PalindromeLinkedList.isPalindrome(head));
    }

}
