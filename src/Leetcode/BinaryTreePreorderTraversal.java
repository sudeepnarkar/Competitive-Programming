package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    Given a binary tree, return the preorder traversal of its nodes' values.

    public List<Integer> preorderTraversalIterative(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while (st.size() != 0 || root != null) {
            while (root != null) {
                list.add(root.val);
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            root = root.right;
        }
        return list;
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversalRecursive(root.left);
        preorderTraversalRecursive(root.right);
        return list;
    }
}
