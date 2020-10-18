package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Given a binary tree, return the inorder traversal of its nodes' values using an iterative solution. Recursive is trivial.
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<TreeNode> st = new Stack<>();
        while (root != null || st.size() != 0) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversalRecursive(TreeNode root) {

        if (root == null) {
            return list;
        }
        inorderTraversalRecursive(root.left);
        list.add(root.val);
        inorderTraversalRecursive(root.right);
        return list;
    }
}
