package Leetcode;

public class SymmetricTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        if (root.left.val != root.right.val) {
            return false;
        }

        return isSymmetricUtil(root.left, root.right);

    }


    boolean isSymmetricUtil(TreeNode left, TreeNode right) {


        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        if (left.left != null && right.right != null) {
            if (left.left.val != right.right.val) {
                return false;
            }

        }

        if (left.right != null && right.left != null) {
            if (left.right.val != right.left.val) {
                return false;
            }

        }

        return isSymmetricUtil(left.left, right.right) && isSymmetricUtil(left.right, right.left);
    }
}
