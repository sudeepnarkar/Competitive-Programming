package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/3/21, Sat, 8:32 AM
 **/

//https://leetcode.com/problems/binary-tree-pruning
public class BinaryTreePruning {

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


    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N)(recursion stack), where N is the number of nodes in the tree
    public TreeNode pruneTree(TreeNode root) {

        if (root == null) {
            return root;
        }
        containValuesOne(root);

        //prune a single node with zero value
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }
        return root;

    }

    //utility function to check for one's in the subtree
    public boolean containValuesOne(TreeNode root) {

        if (root == null) {
            return false;
        }

        //check left and right subtree for ones
        boolean leftContainsOne = containValuesOne(root.left);
        boolean rightContainsOne = containValuesOne(root.right);

        //If there are no one's in the left subtree, prune it
        if (!leftContainsOne) {
            root.left = null;
        }
        //If there are no one's in the right subtree, prune it
        if (!rightContainsOne) {
            root.right = null;
        }
        return root.val == 1 || leftContainsOne || rightContainsOne;
    }
}
