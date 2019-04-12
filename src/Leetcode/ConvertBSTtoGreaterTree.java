package Leetcode;

public class ConvertBSTtoGreaterTree {


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        TreeNode curr = root;
        solve(curr);
        return root;
    }
    public void solve(TreeNode root){
        if(root == null){
            return;
        }
        solve(root.right);
        root.val+= sum;
        sum = root.val;
        solve(root.left);
    }
}
