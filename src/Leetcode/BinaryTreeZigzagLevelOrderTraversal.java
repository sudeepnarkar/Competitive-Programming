package Leetcode;

import java.util.*;

/**
 * @author : Sudeep Narkar
 * @since : 11/13/2020, Fri, 08:00 PM
 **/

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
public class BinaryTreeZigzagLevelOrderTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * <p>
     * return its zigzag level order traversal as:
     * <p>
     * [
     * [3],
     * [20,9],
     * [15,7]
     * ]
     */

    //Time Complexity = O(N + N(LogN)), where N is the total number nodes in a tree
    //Space Complexity = O(N), where N is the total number nodes in a tree
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean even = true;
        while (q.size() != 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                list.add(node.val);
            }

            if (!even) {
                Collections.reverse(list);
            }
            even = !even;
            res.add(list);
        }
        return res;
    }
}
