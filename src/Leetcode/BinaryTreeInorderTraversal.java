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
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,null,2,3]
     * Output: [1,3,2]
     * Example 2:
     * <p>
     * Input: root = []
     * Output: []
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: [1]
     * Example 4:
     * <p>
     * <p>
     * Input: root = [1,2]
     * Output: [2,1]
     * Example 5:
     * <p>
     * <p>
     * Input: root = [1,null,2]
     * Output: [1,2]
     */

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree
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

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree considering the recursion stack
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
