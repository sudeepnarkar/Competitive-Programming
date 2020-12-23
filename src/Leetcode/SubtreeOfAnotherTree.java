package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/23/2020, Wed, 12:30 PM
 **/

//https://leetcode.com/problems/subtree-of-another-tree
public class SubtreeOfAnotherTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Time Complexity = O(M*N), where M is the number of nodes in s and N are the number of nodes in t
    // Space Complexity = O(H), where H is the height of s. So the avg is O(log M) for balanced tree and O(M) for a skewed tree
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (s == null) {
            return false;
        }

        if (isIdentical(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isIdentical(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }
}
