package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallest {

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
     *Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     *
     *
     *
     * Example 1:
     *
     * Input: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * Output: 1
     * Example 2:
     *
     * Input: root = [5,3,6,2,4,null,null,1], k = 3
     *        5
     *       / \
     *      3   6
     *     / \
     *    2   4
     *   /
     *  1
     * Output: 3
     */

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        list = kthSmallestRecursive(root, list);
        return list.get(k - 1);
    }

    // In-order traversal of BST gives elements in non-decreasing order.
    ArrayList<Integer> kthSmallestRecursive(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        kthSmallestRecursive(root.left, list);
        list.add(root.val);
        kthSmallestRecursive(root.right, list);
        return list;
    }

    // In-order traversal of BST gives elements in non-decreasing order.
    public int kthSmallestIterative(TreeNode root, int k) {

        Stack<TreeNode> st = new Stack<>();
        int res = 0;
        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if (--k == 0) {
                res = root.val;
                break;
            }
            root = root.right;
        }
        return res;
    }
}
