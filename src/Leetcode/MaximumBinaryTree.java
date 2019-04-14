package Leetcode;

public class MaximumBinaryTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /*Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

   -- The root is the maximum number in the array.
   -- The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
   -- The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
      Construct the maximum tree by the given array and output the root node of this tree.*/


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(0, nums.length - 1, nums);
    }

    TreeNode constructTree(int low, int high, int[] nums) {

        if (low > high) {
            return null;
        }
        int index = getMax(nums, low, high);
        TreeNode root = new TreeNode(nums[index]);
        root.left = constructTree(low, index - 1, nums);
        root.right = constructTree(index + 1, high, nums);
        return root;
    }

    int getMax(int[] nums, int low, int high) {
        int index = low;
        for (int i = low; i <= high; i++) {
            if (nums[index] < nums[i]) {
                index = i;
            }
        }
        return index;
    }
}
