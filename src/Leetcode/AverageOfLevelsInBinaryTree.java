package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 4/18/21, Sun, 10:17 PM
 **/

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class AverageOfLevelsInBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Time Complexity = O(N), where N is the number of nodes in a tree
    //Space Complexity = O(N), where N is the number of nodes in a tree
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        double sum = 0;
        double size = 0;
        while (q.size() != 0) {
            sum = 0;
            size = q.size();
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
