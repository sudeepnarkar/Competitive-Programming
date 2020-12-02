package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/1/2020, Tue, 6:33 PM
 **/
//https://leetcode.com/problems/lru-cache/solution
public class LRUCache {


    /**
     * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
     * <p>
     * Implement the LRUCache class:
     * <p>
     * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
     * int get(int key) Return the value of the key if the key exists, otherwise return -1.
     * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
     * <p>
     * Follow up:
     * Could you do get and put in O(1) time complexity?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input
     * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
     * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
     * Output
     * [null, null, null, 1, null, -1, null, -1, 3, 4]
     * <p>
     * Explanation
     * LRUCache lRUCache = new LRUCache(2);
     * lRUCache.put(1, 1); // cache is {1=1}
     * lRUCache.put(2, 2); // cache is {1=1, 2=2}
     * lRUCache.get(1);    // return 1
     * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
     * lRUCache.get(2);    // returns -1 (not found)
     * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
     * lRUCache.get(1);    // return -1 (not found)
     * lRUCache.get(3);    // return 3
     * lRUCache.get(4);    // return 4
     */

    // Time complexity = O(1). As the get and put operations are done in constant time.
    // Space complexity = O(Capacity)
    public class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    public void addNode(Node node) {

        // add node to the front
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void removeNode(Node node) {

        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void setNodeAsMostRecent(Node node) {
        removeNode(node);
        addNode(node);
    }

    public Node getLeastRecentlyUsedNode() {
        Node prev = tail.prev;
        return prev;
    }


    Node head;
    Node tail;
    int capacity;
    int size;
    HashMap<Integer, Node> cacheMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        Node node = cacheMap.get(key);
        // check if key is present
        if (node == null) {
            return -1;
        }
        removeNode(node);
        addNode(node);
        int value = node.value;
        return value;
    }


    public void put(int key, int value) {

        Node node = cacheMap.get(key);

        //check if key is present, if yes just replace value and return
        if (node != null) {
            node.value = value;
            setNodeAsMostRecent(node);
            return;
        }
        // Create a new node. Add to the map and to the doubly linked list
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        cacheMap.put(key, newNode);
        addNode(newNode);
        size++;
        // If size is greater than capacity, remove the least recently used node from map and doubly linked list
        if (size > capacity) {
            Node LRUNode = getLeastRecentlyUsedNode();
            removeNode(LRUNode);
            cacheMap.remove(LRUNode.key);
            size--;
        }
    }
}
