package Leetcode;

public class IsSubtree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSubtree(TreeNode t1, TreeNode t2) {

        if (t1 == null) {
            return false;
        }

        if (isSubtreeUtil(t1, t2)) {
            return true;
        }
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }


    public boolean isSubtreeUtil(TreeNode t1, TreeNode t2) {


        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }

        if (t1.val != t2.val) {
            return false;
        }
        return isSubtreeUtil(t1.left, t2.left) && isSubtreeUtil(t1.right, t2.right);
    }

}
