package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/24/2020, Tue, 6:20 PM
 **/

public class ClosestBinarySearchTreeValue {


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
     * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
     * <p>
     * Note:
     * <p>
     * Given target value is a floating point.
     * You are guaranteed to have only one unique value in the BST that is closest to the target.
     * <p>
     * Example:
     * <p>
     * Input: root = [4,2,5,1,3], target = 3.714286
     * <p>
     * 4
     * / \
     * 2   5
     * / \
     * 1   3
     * <p>
     * Output: 4
     *
     * @param root
     * @param target
     * @return closest value
     */


    public int closestValue(TreeNode root, double target) {
        int closestVal = root.val;
        return closestValueUtil(root, target, closestVal);

    }

    public int closestValueUtil(TreeNode root, double target, int closestVal) {
        if (root == null) {
            return closestVal;
        }
        if (Math.abs(root.val - target) < Math.abs(closestVal - target)) {
            closestVal = root.val;
        }
        if (target > root.val) {
            closestVal = closestValueUtil(root.right, target, closestVal);
        } else {
            closestVal = closestValueUtil(root.left, target, closestVal);
        }
        return closestVal;
    }
}
