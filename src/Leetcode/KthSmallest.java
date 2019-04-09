package Leetcode;

import java.util.ArrayList;

public class KthSmallest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        list = traverse(root, list);
        return list.get(k - 1);
    }

    // In-order traversal of BST gives elements in non-decreasing order.
    ArrayList<Integer> traverse(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
        return list;
    }
}
