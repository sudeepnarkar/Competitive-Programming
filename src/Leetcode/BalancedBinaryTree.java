package Leetcode;

//https://leetcode.com/problems/balanced-binary-tree/solution
public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    boolean result = true;

    /**
     * Given a binary tree, determine if it is height-balanced.
     * <p>
     * For this problem, a height-balanced binary tree is defined as:
     * <p>
     * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: root = [1,2,2,3,3,null,null,4,4]
     * Output: false
     * Example 3:
     * <p>
     * Input: root = []
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 5000].
     * -104 <= Node.val <= 104
     *
     * @param root
     * @return true if Binary Tree is balanced or return false
     */


    //Time Complexity = O(N), where N is the number of nodes of tree
    //Space Complexity = O(H), where H is the height of tree
    public boolean isBalanced(TreeNode root) {
        int res = depth(root);
        return result;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        if (Math.abs(left - right) > 1) {
            result = false;
        }
        return Math.max(left, right) + 1;
    }
}
