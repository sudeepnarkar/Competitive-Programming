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


    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        } else {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
    }

}


