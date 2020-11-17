package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/17/2020, Tue, 7:03 AM
 **/

//https://leetcode.com/problems/path-sum
public class PathSum {


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

        /**
         * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
         * <p>
         * Note: A leaf is a node with no children.
         * <p>
         * Example:
         * <p>
         * Given the below binary tree and sum = 22,
         * <p>
         * 5
         * / \
         * 4   8
         * /   / \
         * 11  13  4
         * /  \      \
         * 7    2      1
         *
         * @param root
         * @param sum
         * @return true if the path sum exist or return false
         */


        public boolean hasPathSum(TreeNode root, int sum) {

            if (root == null) {
                return false;

            }
            if (root.left == null && root.right == null) {
                return root.val == sum;
            }
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
