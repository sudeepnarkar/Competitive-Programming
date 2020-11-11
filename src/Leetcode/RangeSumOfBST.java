package Leetcode;


/**
 * @author : Sudeep Narkar
 * @since : 11/11/2020, Tue, 7:46 AM
 **/

//https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumOfBST {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * Given the root node of a binary search tree, return the sum of values of all nodes with a value in the range [low, high].
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
     * Output: 32
     * <p>
     * Example 2:
     * <p>
     * Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
     * Output: 23
     */


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


