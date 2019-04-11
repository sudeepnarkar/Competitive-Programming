package Leetcode;

public class MergeTrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /*Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

    You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.

        Otherwise, the NOT null node will be used as the node of new tree.*/


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {


        if (t1 == null && t2 == null) return null;

        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode root = new TreeNode(val);

        root.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return root;
    }
}
