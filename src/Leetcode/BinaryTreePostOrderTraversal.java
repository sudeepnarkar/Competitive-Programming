package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


//https://leetcode.com/problems/binary-tree-postorder-traversal
public class BinaryTreePostOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Given a binary tree, return the postorder traversal of its nodes' values.

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversalRecursive(TreeNode root) {

        if (root == null) {
            return list;
        }

        postorderTraversalRecursive(root.left);
        postorderTraversalRecursive(root.right);
        list.add(root.val);
        return list;

    }

    public List<Integer> postorderTraversalIterative(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return ans;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            ans.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return ans;
    }
}
