package Leetcode;

public class SumRootToLeafNumbers {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

   /* Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

    An example is the root-to-leaf path 1->2->3 which represents the number 123.

    Find the total sum of all root-to-leaf numbers.

    Note: A leaf is a node with no children.*/

    public int sumNumbers(TreeNode root) {
        return sumPath(root,0);
    }

    public int  sumPath(TreeNode root, int  val){
        if(root == null){
            return 0;
        }
        val = root.val+val*10;
        int sum = 0;
        if(root.left == null && root.right == null){
            sum+=val;
            return sum;
        }
        return sumPath(root.left,val)+sumPath(root.right,val);
    }
}
