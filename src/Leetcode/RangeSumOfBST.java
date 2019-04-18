package Leetcode;

public class RangeSumOfBST {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /*Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

    The binary search tree is guaranteed to have unique values.*/


    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        return rangeSumBSTUtil(root, L, R);
    }

    int rangeSumBSTUtil(TreeNode root, int L, int R) {

        if (root == null) {
            return sum;
        }
        if (root.val < L) {
            return rangeSumBSTUtil(root.right, L, R);
        } else if (root.val > R) {
            return rangeSumBSTUtil(root.left, L, R);
        } else {
            return root.val + rangeSumBSTUtil(root.left, L, R) + rangeSumBSTUtil(root.right, L, R);
        }
    }
}
