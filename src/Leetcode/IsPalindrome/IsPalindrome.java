package Leetcode.IsPalindrome;

import java.util.Stack;


 class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
    }
  }

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            st.push(curr);
                    curr = curr.next;
        }

        while(!st.isEmpty() || head!=null){
            if (st.pop().val!=head.val){
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
