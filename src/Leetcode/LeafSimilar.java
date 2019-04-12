package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = traverse(root1, list1);
        list2 = traverse(root2, list2);

        return list1.equals(list2);
    }

    List<Integer> traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        traverse(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        traverse(root.right, list);
        return list;
    }
}
