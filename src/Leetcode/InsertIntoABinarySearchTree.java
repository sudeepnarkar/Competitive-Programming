package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/6/21, Sat, 9:45 PM
 **/

//https://leetcode.com/problems/insert-into-a-binary-search-tree
public class InsertIntoABinarySearchTree {

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


    //Time Complexity = O(N) for skewed BST, where N is the number of nodes in a tree
    //Space Complexity = O(N) for skewed BST, where N is the number of nodes in a tree
    //counting the recursion stack
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
