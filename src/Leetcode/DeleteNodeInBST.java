package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/1/2020, Sun, 12:02 PM
 **/

//https://leetcode.com/problems/delete-node-in-a-bst
public class DeleteNodeInBST {


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

    /**
     * Given a root node reference of a BST and a key, delete the node with the given key in the BST.
     * Return the root node reference (possibly updated) of the BST.
     * <p>
     * Basically, the deletion can be divided into two stages:
     * <p>
     * Search for a node to remove.
     * If the node is found, delete the node.
     * Follow up: Can you solve it with time complexity O(height of tree)?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [5,3,6,2,4,null,7], key = 3
     * Output: [5,4,6,2,null,null,7]
     * Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
     * One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
     * Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
     * <p>
     * Example 2:
     * <p>
     * Input: root = [5,3,6,2,4,null,7], key = 0
     * Output: [5,3,6,2,4,null,7]
     * Explanation: The tree does not contain a node with value = 0.
     * Example 3:
     * <p>
     * Input: root = [], key = 0
     * Output: []
     */


    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteNodeUtil(root, key);
    }

    public TreeNode deleteNodeUtil(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val < key) {
            root.right = deleteNodeUtil(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNodeUtil(root.left, key);
        } else {
            // node to be deleted.
            // case 1: Node has no children
            // case 2: Node has one children
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // case 3: Node has two children
            // replace the value of the node to be deleted with it's inorder successor
            root.val = deleteMin(root.right, key);
            // delete the inorder successor
            root.right = deleteNodeUtil(root.right, root.val);
        }

        return root;

    }

    // find the next in order successor value
    public int deleteMin(TreeNode root, int key) {
        int min = root.val;
        while (root != null) {
            min = Math.min(min, root.val);
            root = root.left;
        }
        return min;
    }
}
