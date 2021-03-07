package Leetcode;

import java.util.*;

/**
 * @author : Sudeep Narkar
 * @since : 3/7/21, Sun, 12:05 PM
 **/

//https://leetcode.com/problems/all-elements-in-two-binary-search-trees
public class AllElementsInTwoBinarySearchTrees {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Given two binary search trees root1 and root2.
     * <p>
     * Return a list containing all the integers from both trees sorted in ascending order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root1 = [2,1,4], root2 = [1,0,3]
     * Output: [0,1,1,2,3,4]
     * Example 2:
     * <p>
     * Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
     * Output: [-10,0,0,1,2,5,7,10]
     * Example 3:
     * <p>
     * Input: root1 = [], root2 = [5,1,7,0,2]
     * Output: [0,1,2,5,7]
     * Example 4:
     * <p>
     * Input: root1 = [0,-10,10], root2 = []
     * Output: [-10,0,10]
     * Example 5:
     * <p>
     * <p>
     * Input: root1 = [1,null,8], root2 = [8,1]
     * Output: [1,1,8,8]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * Each tree has at most 5000 nodes.
     * Each node's value is between [-10^5, 10^5].
     *
     * @param root1
     * @param root2
     * @return a list containing all the integers from both trees sorted in ascending order.
     */
    //Method 1 : In order traversal on both trees and the sort the list.
    // Time Complexity O(N+M) + O((N+M)log(N+M)), where N and M is the number of nodes in T1 and T2 respectively.
    // Space Complexity O(N+M) , where N and M is the number of nodes in T1 and T2 respectively.
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> res = new ArrayList<>();
        inOrderTraverse(root1, res);
        inOrderTraverse(root2, res);
        Collections.sort(res);
        return res;
    }

    public void inOrderTraverse(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inOrderTraverse(root.left, list);
        list.add(root.val);
        inOrderTraverse(root.right, list);
        return;
    }

    //Method 1 : In order traversal on both trees and store in queue and then merge the two queues
    // Time Complexity O(N+M), where N and M is the number of nodes in T1 and T2 respectively.
    // Space Complexity O(N+M), where N and M is the number of nodes in T1 and T2 respectively.
    public List<Integer> getAllElementsUsingQueue(TreeNode root1, TreeNode root2) {

        List<Integer> res = new ArrayList<>();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        inOrderTraverse2(root1, q1);
        inOrderTraverse2(root2, q2);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            if (q1.isEmpty()) {
                res.add(q2.poll());
            } else if (q2.isEmpty()) {
                res.add(q1.poll());
            } else {
                int val = q1.peek() > q2.peek() ? q2.poll() : q1.poll();
                res.add(val);
            }
        }
        return res;
    }

    public void inOrderTraverse2(TreeNode root, Queue<Integer> q) {

        if (root == null) {
            return;
        }

        inOrderTraverse2(root.left, q);
        q.add(root.val);
        inOrderTraverse2(root.right, q);
        return;
    }
}
