package Leetcode;

public class SumRootToLeaf {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    int sum = 0;
    public int c(TreeNode root) {

        sum(root, 0);
        return sum;
    }

    private void sum(TreeNode root, int val) {
        if (root == null) return;

        val = 2 * val + root.val;

        if (root.left == null && root.right == null) {
            sum += val;
            return;
        }

        sum(root.left, val);
        sum(root.right, val);
    }
}
