package Leetcode;

import java.util.Stack;

public class IsValidBST {


/*
    Given a binary tree, determine if it is a valid binary search tree (BST).

    Assume a BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.
*/

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isValidBSTRecursive(TreeNode root) {
        Long min = Long.MIN_VALUE;
        Long max = Long.MAX_VALUE;

        return isValidBSTUtil(root, min, max);
    }

    public boolean isValidBSTUtil(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }
        if (root.val >= max) {
            return false;
        }

        if (root.val <= min) {
            return false;
        }
        return isValidBSTUtil(root.left, min, root.val) && isValidBSTUtil(root.right, root.val, max);
    }

    public boolean isValidBSTIterative(TreeNode root) {
        long inorder = Long.MIN_VALUE;
        Stack<TreeNode> st = new Stack<>();

        while (!st.isEmpty() || root != null) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            // In an inorder traversal of a BST (non-descending order), the previous element cannot be greater than the current
            root = st.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
