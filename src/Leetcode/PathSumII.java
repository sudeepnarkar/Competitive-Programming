package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 11/17/2020, Tue, 10:08 PM
 **/

//https://leetcode.com/problems/path-sum-ii/
public class PathSumII {

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
     * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
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
     * /  \    / \
     * 7    2  5   1
     * <p>
     * Return:
     * <p>
     * [
     * [5,4,11,2],
     * [5,8,4,5]
     * ]
     */


    List<List<Integer>> list = new ArrayList<>();
    ArrayList<Integer> sList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        pathSumUtil(root, sum);
        return list;
    }

    public void pathSumUtil(TreeNode root, int sum) {

        if (root == null) {
            return;

        }
        sList.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            list.add(new ArrayList<>(sList));
        } else {
            pathSumUtil(root.left, sum - root.val);
            pathSumUtil(root.right, sum - root.val);

        }
        int size = sList.size();
        sList.remove(size - 1);

    }
}
