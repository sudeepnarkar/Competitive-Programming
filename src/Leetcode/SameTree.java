package Leetcode;

public class SameTree {


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


   /* Given two binary trees, write a function to check if they are the same or not.

    Two binary trees are considered the same if they are structurally identical and the nodes have the same value.*/


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p == null || q ==  null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }
}
