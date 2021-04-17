package Leetcode;

//https://leetcode.com/problems/insert-into-a-binary-search-tree
public class InsertIntoBST {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
     * <p>
     * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [4,2,7,1,3], val = 5
     * Output: [4,2,7,1,3,5]
     * Explanation: Another accepted tree is:
     * <p>
     * Example 2:
     * <p>
     * Input: root = [40,20,60,10,30,50,70], val = 25
     * Output: [40,20,60,10,30,50,70,null,null,25]
     * Example 3:
     * <p>
     * Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
     * Output: [4,2,7,1,3,5]
     *
     * @param root
     * @param val
     * @return root after insertion
     */

    //Time Complexity = O(N), where N is the number of nodes in tree
    //Space Complexity = O(N), counting recursion stack
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
