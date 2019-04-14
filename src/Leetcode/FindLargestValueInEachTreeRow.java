package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Find the largest value in each row of a binary tree.

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size;
        int max;
        while (q.size() != 0) {
            size = q.size();
            max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
               if(node.val>max){
                   max = node.val;
               }
            }
            list.add(max);
        }
        return list;
    }
}
