package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     *
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     *
     * Example 1:
     *
     *
     * Input: root = [1,null,2,3]
     * Output: [1,3,2]
     * Example 2:
     *
     * Input: root = []
     * Output: []
     * Example 3:
     *
     * Input: root = [1]
     * Output: [1]
     * Example 4:
     *
     *
     * Input: root = [1,2]
     * Output: [2,1]
     * Example 5:
     *
     *
     * Input: root = [1,null,2]
     * Output: [1,2]

     */
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
