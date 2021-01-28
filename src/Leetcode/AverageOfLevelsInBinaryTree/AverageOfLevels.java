package Leetcode.AverageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 11/10/2020, Tue, 6:47 AM
 **/


//https://leetcode.com/problems/average-of-levels-in-binary-tree
public class AverageOfLevels {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * Output: [3, 14.5, 11]
     * Explanation:
     * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
     */


    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Time Complexity = O(N), where N is the number of nodes in the tree
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size() != 0) {
            double sum = 0;
            double size = q.size();
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
            list.add(sum / size);
        }
        return list;
    }
}
