package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/symmetric-tree
public class SymmetricTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * <p>
     * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
     * <p>
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     * <p>
     * <p>
     * <p>
     * But the following [1,2,2,null,3,null,3] is not:
     * <p>
     * 1
     * / \
     * 2   2
     * \   \
     * 3    3
     *
     * @param root
     * @return true if the tree is symmetric or return false
     */


    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricUtil(root.left, root.right);
    }


    boolean isSymmetricUtil(TreeNode left, TreeNode right) {


        // If either left or right is null, check if both are null
        if (left == null || right == null) {
            return left == right;
        }

        // Left and Right are not null, so check if their values are equal
        if (left.val != right.val) {
            return false;
        }

        // repeat for left and right subtree recursively
        return isSymmetricUtil(left.left, right.right) && isSymmetricUtil(left.right, right.left);
    }

    public boolean isSymmetricIterative(TreeNode root) {

        if (root == null) {
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode left = root.left;
        TreeNode right = root.right;

        q.offer(left);
        q.offer(right);

        while (q.size() != 0) {
            left = q.poll();
            right = q.poll();
            // If both left and right are null, keeping removing from the queue
            if (left == null && right == null) {
                continue;
            }
            // If either left or right is null or if their values are not equal return false
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);
        }
        return true;
    }
}
