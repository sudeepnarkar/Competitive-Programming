package Leetcode.IsPalindrome;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class IsPalindromeTest {


    @Test
    public void isPalindromeTestForPalindrome() {
        int [] arr = new int[]{1,2,2,1};

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);

        assertEquals(true, IsPalindrome.isPalindrome(curr));
    }

    @Test
    public void isPalindromeTestForNonPalindrome() {

        int [] arr = new int[]{1,1,2,1};

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);

        assertEquals(false, IsPalindrome.isPalindrome(curr));
    }

}