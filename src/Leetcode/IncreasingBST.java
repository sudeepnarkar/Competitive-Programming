package Leetcode;

import java.util.ArrayList;

public class IncreasingBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = left;
            this.right = right;

        }
    }

    public TreeNode increasingBST(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        list = increasingBSTUtil(root, list);
        root = new TreeNode(list.get(0));
        TreeNode curr = root;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            curr.left = null;
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }
        return root;
    }

    ArrayList<Integer> increasingBSTUtil(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        increasingBSTUtil(root.left, list);
        list.add(root.val);
        increasingBSTUtil(root.right, list);
        return list;

    }
}
