package Leetcode;

public class SearchBST {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /*Given the root node of a binary search tree (BST) and a value.
    You need to find the node in the BST that the node's value equals the given value.
    Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.*/

    public TreeNode searchBSTRecursive(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        else if (root.val<val){
            return searchBSTRecursive(root.right,val);
        }else{
            return searchBSTRecursive(root.left,val);
        }
    }

    public TreeNode searchBSTIterative(TreeNode root, int val) {

        while(root!=null && root.val!=val){
            if (root.val>val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return root;
    }
}
