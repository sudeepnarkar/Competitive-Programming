package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
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

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree
    public List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (st.size() != 0) {
            TreeNode node = st.pop();
            list.add(node.val);
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return list;
    }

    List<Integer> list = new ArrayList<>();


    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree considering the recursion stack
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
