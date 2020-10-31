package DataStructures.HashMap;


/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 7:59 AM
 **/

public class HashMapByChaining {

    ListNode[] nodes = new ListNode[10];

    /**
     * Implementation of HashMap by chaining
     */

    class ListNode {
        int key;
        int val;
        ListNode next;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    int idx(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    void put(int key, int val) {

        int bucket = idx(key);
        if (nodes[bucket] == null) {
            //create a sentinel or dummy node for every start of the bucket
            nodes[bucket] = new ListNode(-1, -1);
        }

        ListNode prev = findPrevNode(nodes[bucket], key);
        if (prev.next == null) {
            prev.next = new ListNode(key, val);
        } else {
            prev.next.val = val;
        }
    }

    ListNode findPrevNode(ListNode node, int key) {

        ListNode prev = null;
        while (node != null && node.key != key) {
            prev = node;
            node = node.next;
        }
        return prev;
    }

    int get(int key) {
        int bucket = idx(key);
        ListNode prev = findPrevNode(nodes[bucket], key);
        return prev == null ? -1 : prev.next.val;
    }

    void remove(int key) {
        int bucket = idx(key);
        if (nodes[bucket] == null) {
            return;
        }

        ListNode prev = findPrevNode(nodes[bucket], key);
        if (prev.next == null) {
            return;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        HashMapByChaining map = new HashMapByChaining();
        map.put(1, 2);
        System.out.println(map.get(1));
        map.put(1, 4);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        map.put(11, 11);
        System.out.println(map.get(11));
    }
}
