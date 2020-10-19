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

    /**
     * Given the root of a binary tree, return the postorder traversal of its nodes' values.
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,null,2,3]
     * Output: [3,2,1]
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
     * Output: [2,1]
     */

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
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return result;
    }
}
