package Leetcode;

public class LowestCommonAncestorBT {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

   /* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
    two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node
            to be a descendant of itself).”*/

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }else{
            return right;
        }
    }
}
