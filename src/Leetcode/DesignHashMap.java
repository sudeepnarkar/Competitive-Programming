package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 9:24 AM
 **/

//https://leetcode.com/problems/design-hashmap/
public class DesignHashMap {


    /**
     * Design a HashMap without using any built-in hash table libraries.
     *
     * To be specific, your design should include these functions:
     *
     * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
     * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
     * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
     *
     * Example:
     *
     * MyHashMap hashMap = new MyHashMap();
     * hashMap.put(1, 1);
     * hashMap.put(2, 2);
     * hashMap.get(1);            // returns 1
     * hashMap.get(3);            // returns -1 (not found)
     * hashMap.put(2, 1);          // update the existing value
     * hashMap.get(2);            // returns 1
     * hashMap.remove(2);          // remove the mapping for 2
     * hashMap.get(2);            // returns -1 (not found)
     *
     */
    ListNode[] nodes = new ListNode[10];

    class ListNode {
        int key;
        int val;
        ListNode next;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public DesignHashMap() {

    }

    public int idx(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    public ListNode findPrevNode(ListNode node, int key) {

        ListNode prev = null;
        while (node != null && node.key != key) {
            prev = node;
            node = node.next;
        }
        return prev;
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {

        int bucket = idx(key);
        if (nodes[bucket] == null) {
            //create a sentinel or dummy node for every start of the bucket
            nodes[bucket] = new ListNode(-1, -1);
        }

        ListNode prev = findPrevNode(nodes[bucket], key);
        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        } else {
            prev.next.val = value;
        }

    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int bucket = idx(key);
        if (nodes[bucket] == null) {
            return -1;
        }
        ListNode prev = findPrevNode(nodes[bucket], key);
        return prev.next == null ? -1 : prev.next.val;

    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
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
}
