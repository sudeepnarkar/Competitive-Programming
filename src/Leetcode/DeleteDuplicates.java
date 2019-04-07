package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeleteDuplicates {

    public  static class  ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode deleteDups(ListNode head){
        HashSet<Integer> set  = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        ListNode curr = head;
        while(curr!=null){
            if (set.contains(curr.val)){
                list.add(curr.val);
            }else{
                set.add(curr.val);
            }
            curr = curr.next;
        }

        curr = head;
        while(list.contains(curr.val)){
            curr = curr.next;
            head = curr;
        }
        while(curr!=null && curr.next!=null){
            if(list.contains(curr.next.val)){
                curr = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
