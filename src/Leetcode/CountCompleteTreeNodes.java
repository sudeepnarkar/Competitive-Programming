package Leetcode;

public class CountCompleteTreeNodes {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int countNodes(TreeNode root) {
        return countSize(root);
    }

    int countSize(TreeNode node) {
        if (node == null)
            return 0;
        else
            return countSize(node.left) + 1 + countSize(node.right);
    }
}
