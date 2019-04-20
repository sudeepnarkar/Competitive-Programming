package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//  Given a binary tree, find the leftmost value in the last row of the tree.

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size = 0;
        TreeNode node = null;
        while (q.size() != 0) {
            size = q.size();
            for (int i = 0; i < size; i++) {
                node = q.remove();
                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
            }
        }
        return node.val;
    }
}
