package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 11/5/2020, Thu, 9:00 PM
 **/

//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
public class MaximumLevelSumOfABinaryTree {


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
     * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
     * <p>
     * Return the smallest level X such that the sum of all the values of nodes at level X is maximal.
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,7,0,7,-8,null,null]
     * Output: 2
     * Explanation:
     * Level 1 sum = 1.
     * Level 2 sum = 7 + 0 = 7.
     * Level 3 sum = 7 + -8 = -1.
     * So we return the level with the maximum sum which is level 2.
     * <p>
     * Example 2:
     * <p>
     * Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
     * Output: 2
     */

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Time Complexity = O(M), where M is the maximum number of nodes in a level
    public int maxLevelSum(TreeNode root) {

        int level = 0;
        int resLevel = 0;
        if (root == null) {
            return level;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (q.size() != 0) {
            int size = q.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                sum += node.val;
            }
            level++;
            if (maxSum < sum) {
                maxSum = sum;
                resLevel = level;
            }
        }
        return resLevel;
    }
}
