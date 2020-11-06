package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/5/2020, Thu, 9:24 PM
 **/

//https://leetcode.com/problems/maximum-depth-of-binary-tree/solution
public class MaximumDepthOfBinaryTree {


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
     * Given a binary tree, find its maximum depth.
     * <p>
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * <p>
     * Note: A leaf is a node with no children.
     * <p>
     * Example:
     * <p>
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * <p>
     * return its depth = 3.
     */

    public int maxDepth(TreeNode root) {
        return maxDepthUtil(root, 0);
    }

    public int maxDepthUtil(TreeNode root, int maxDepth) {
        if (root == null) {
            return maxDepth;
        }
        return Math.max(maxDepthUtil(root.left, maxDepth + 1), maxDepthUtil(root.right, maxDepth + 1));
    }
}
