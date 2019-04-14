package Leetcode;

import java.util.TreeSet;

public class FindSecondMinimumValue {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        TreeSet<Integer> set = new TreeSet<>();
        set = traverseTree(root, set);
        int count = 0;
        int res = -1;
        for (int num : set) {
            if (count == 1) {
                res = num;
                break;
            }
            count++;
        }
        return res;
    }

    TreeSet<Integer> traverseTree(TreeNode root, TreeSet<Integer> set) {

        if (root == null) {
            return set;
        }
        traverseTree(root.left, set);
        set.add(root.val);
        traverseTree(root.right, set);
        return set;
    }
}
