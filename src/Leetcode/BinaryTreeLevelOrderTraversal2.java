package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 10/19/2020, Mon, 10:50 PM
 **/

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii
public class BinaryTreeLevelOrderTraversal2 {


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
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its bottom-up level order traversal as:
     * [
     * [15,7],
     * [9,20],
     * [3]
     * ]
     */

    //Time Complexity = O(N), where N is the number of nodes in tree
    //Space Complexity = O(N), where N is the number of nodes in tree
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                subList.add(node.val);
            }
            list.addFirst(subList);
        }
        return list;
    }
}
