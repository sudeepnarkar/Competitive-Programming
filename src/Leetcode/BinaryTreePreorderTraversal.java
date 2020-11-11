package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given the root of a binary tree, return the preorder traversal of its nodes' values.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,null,2,3]
     * Output: [1,2,3]
     * <p>
     * Example 2:
     * <p>
     * Input: root = []
     * Output: []
     * <p>
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: [1]
     * <p>
     * Example 4:
     * <p>
     * Input: root = [1,2]
     * Output: [1,2]
     * <p>
     * Example 5:
     * <p>
     * Input: root = [1,null,2]
     * Output: [1,2]
     */

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
