package Leetcode;

import java.util.ArrayList;

/**
 * @author : Sudeep Narkar
 * @since : 11/20/2020, Fri, 9:49 PM
 **/

//https://leetcode.com/problems/path-sum-iii
public class PathSumIII {


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
     * 437. Path Sum III
     * Medium
     * <p>
     * You are given a binary tree in which each node contains an integer value.
     * <p>
     * Find the number of paths that sum to a given value.
     * <p>
     * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
     * <p>
     * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
     * <p>
     * Example:
     * <p>
     * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
     * <p>
     * 10
     * /  \
     * 5   -3
     * / \    \
     * 3   2   11
     * / \   \
     * 3  -2   1
     * <p>
     * Return 3. The paths that sum to 8 are:
     * <p>
     * 1.  5 -> 3
     * 2.  5 -> 2 -> 1
     * 3. -3 -> 11
     */

    public int pathSumRecursive(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSumUtilRecursive(root, sum) + pathSumRecursive(root.left, sum) + pathSumRecursive(root.right, sum);
    }

    public int pathSumUtilRecursive(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        return (node.val == sum ? 1 : 0) + pathSumUtilRecursive(node.left, sum - node.val) + pathSumUtilRecursive(node.right, sum - node.val);
    }


    int count = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public int pathSumIterative(TreeNode root, int sum) {
        pathSumUtilIterative(root, sum);
        return count;
    }

    public void pathSumUtilIterative(TreeNode root, int sum) {

        if (root == null) {
            return;
        }
        list.add(root.val);
        pathSumUtilIterative(root.left, sum);
        pathSumUtilIterative(root.right, sum);
        int size = list.size();
        int tempSum = 0;
        for (int i = size - 1; i >= 0; i--) {
            tempSum += list.get(i);
            if (tempSum == sum) {
                count++;
            }
        }
        list.remove(size - 1);
    }
}
