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

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        TreeNode node = root;
        while (st.size() != 0 || node != null) {
            while (node != null) {
                list.add(node.val);
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            node = node.right;
        }
        return list;
    }
}
