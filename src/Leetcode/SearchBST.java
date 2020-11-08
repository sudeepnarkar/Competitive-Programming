package Leetcode;

//https://leetcode.com/problems/search-in-a-binary-search-tree/
public class SearchBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
     * <p>
     * For example,
     * <p>
     * Given the tree:
     * 4
     * / \
     * 2   7
     * / \
     * 1   3
     * <p>
     * And the value to search: 2
     * <p>
     * You should return this subtree:
     * <p>
     * 2
     * / \
     * 1   3
     * <p>
     * In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.
     * <p>
     * Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.
     */

    public TreeNode searchBSTRecursive(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBSTRecursive(root.right, val);
        } else {
            return searchBSTRecursive(root.left, val);
        }
    }

    public TreeNode searchBSTIterative(TreeNode root, int val) {

        while (root != null && root.val != val) {
            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}
