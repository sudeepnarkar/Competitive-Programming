package Leetcode.IsPalindrome;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class IsPalindromeTest {

    ListNode head;

    public void insertNode(int data){

        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
        }else{
            ListNode n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }


    @Test
    public void isPalindromeTestForPalindromeLinkedList() {
        //define the linked list values
        int [] arr = new int[]{1,2,2,1};
        for(int el:arr){
            insertNode(el);
        }
        assertEquals(true, IsPalindrome.isPalindrome(head));
    }

    @Test
    public void isPalindromeTestForNonPalindromeLinkedList() {
        //define the linked list values
        int [] arr = new int[]{1,2,1,1};
        for(int el:arr){
            insertNode(el);
        }
        assertEquals(false, IsPalindrome.isPalindrome(head));
    }

}