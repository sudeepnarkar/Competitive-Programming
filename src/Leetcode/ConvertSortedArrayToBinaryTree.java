package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/20/2020, Tue, 9:15 PM
 **/

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
public class ConvertSortedArrayToBinaryTree {


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
     *
     *
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     *
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     *
     * Example:
     *
     * Given the sorted array: [-10,-3,0,5,9],
     *
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     */


    public TreeNode sortedArrayToBST(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        return sortedArrayToBSTUtil(low, high, nums);

    }

    public TreeNode sortedArrayToBSTUtil(int low, int high, int[] nums) {

        if (low > high) {
            return null;
        }

        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTUtil(low, mid - 1, nums);
        node.right = sortedArrayToBSTUtil(mid + 1, high, nums);
        return node;
    }
}