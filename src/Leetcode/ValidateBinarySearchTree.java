package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/13/21, Tue, 9:10 AM
 **/
//https://leetcode.com/problems/validate-binary-search-tree
public class ValidateBinarySearchTree {

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

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity (recusion stack) = O(N), where N is the number of nodes in the tree
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isValidBSTUtil(root, min, max);
    }

    public boolean isValidBSTUtil(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValidBSTUtil(root.left, min, root.val) && isValidBSTUtil(root.right, root.val, max);
    }
}
