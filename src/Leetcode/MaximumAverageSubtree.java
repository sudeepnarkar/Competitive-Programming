package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/17/2021, Sun, 8:11 PM
 **/

//https://leetcode.com/problems/maximum-average-subtree
public class MaximumAverageSubtree {


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

    double maxAverage = 0;

    public double maximumAverageSubtree(TreeNode root) {

        int[] result = maximumAverageSubtreeUtil(root);
        return maxAverage;
    }

    //Time Complexity = O(N), where N is the number of nodes in the Tree
    //Space Complexity = O(N) (worst case for skewed tree counting recursion stack), where N is the number of nodes in the Tree
    public int[] maximumAverageSubtreeUtil(TreeNode root) {

        /**
         * For every nodes, return the sum and the count of it's
         * left and right subtree
         */
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] leftTree = maximumAverageSubtreeUtil(root.left);
        int[] rightTree = maximumAverageSubtreeUtil(root.right);
        int sum = leftTree[0] + rightTree[0] + root.val;
        int count = leftTree[1] + rightTree[1] + 1;
        /**
         * calculate average and store the maximum in maxAverage
         */
        maxAverage = Math.max(maxAverage, (double) sum / count);
        return new int[]{sum, count};
    }
}
