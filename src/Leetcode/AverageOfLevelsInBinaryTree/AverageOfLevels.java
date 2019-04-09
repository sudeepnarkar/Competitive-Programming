package Leetcode.AverageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        double size = 0.0;
        double sum = 0.0;
        while (!q.isEmpty()) {
            size = q.size();
            sum = 0.0;
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
