package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/28/21, Sun, 6:10 PM
 **/

//https://leetcode.com/problems/sum-of-left-leaves
public class SumOfLeftLeaves {

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
         * Find the sum of all left leaves in a given binary tree.
         * <p>
         * Example:
         * <p>
         * 3
         * / \
         * 9  20
         * /  \
         * 15   7
         * <p>
         * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
         *
         * @param root
         * @return
         */

        //Time Complexity = O(N), where N is the number of nodes in tree
        //Space Complexity = O(N), where N is the number of nodes in tree
        public int sumOfLeftLeaves(TreeNode root) {

            if (root == null) {
                return 0;

            }
            //check if left node is a leaf nodes
            else if (root.left != null && root.left.left == null && root.left.right == null) {
                return root.left.val + sumOfLeftLeaves(root.right);
            }
            //check right side
            else {
                return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
        }
    }
}
