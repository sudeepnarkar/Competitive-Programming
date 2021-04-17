package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/7/21, Wed, 7:58 AM
 **/

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-ii
public class LowestCommonAncestorOfABinaryTreeII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N)(counting recursion stack), where N is the number of nodes in the tree
    boolean pExist = false;
    boolean qExist = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = LCA(root, p, q);
        return (!pExist || !qExist) ? null : ans;
    }

    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

       //search the entire tree as P or Q is not guaranteed to exist
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        //check if P or Q exists
        if (root == p || root == q) {
            if (p == root) {
                pExist = true;
            } else {
                qExist = true;
            }
            return root;
        }

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }
}
