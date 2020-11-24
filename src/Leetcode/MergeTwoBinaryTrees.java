package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/23/20, Mon, 7:23 AM
 **/

//https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
     * <p>
     * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * Tree 1                     Tree 2
     * 1                         2
     * / \                       / \
     * 3   2                     1   3
     * /                           \   \
     * 5                             4   7
     * Output:
     * Merged tree:
     * 3
     * / \
     * 4   5
     * / \   \
     * 5   4   7
     * <p>
     * <p>
     * Note: The merging process must start from the root nodes of both trees.
     *
     * @param t1
     * @param t2
     * @return The root of the new merged binary tree
     */

    //TODO : Write an iterative solution
    public TreeNode mergeTreesRecursive(TreeNode t1, TreeNode t2) {
        int val;
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 != null) {
            val = t1.val + t2.val;
        } else {
            val = t1 == null ? t2.val : t1.val;
        }
        TreeNode root = new TreeNode(val);
        root.left = mergeTreesRecursive(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        root.right = mergeTreesRecursive(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return root;
    }
}
