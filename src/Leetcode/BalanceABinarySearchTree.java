package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 3/9/21, Tue, 7:05 AM
 **/

//https://leetcode.com/problems/balance-a-binary-search-tree
public class BalanceABinarySearchTree {

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

    //Time Complexity = O(N), where N is the number of nodes in a tree
    //Space Complexity = O(N), where N is the number of nodes in a tree
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        travsereInorder(root, nodeList);
        int low = 0;
        int high = nodeList.size() - 1;
        TreeNode newRoot = insertIntoBST(low, high, nodeList);
        return newRoot;
    }

    //create a balanced BST from sorted array
    public TreeNode insertIntoBST(int low, int high, List<Integer> nodeList) {

        if (low > high) {
            return null;
        }

        int mid = low + (high - low) / 2;
        int val = nodeList.get(mid);
        TreeNode node = new TreeNode(val);
        node.right = insertIntoBST(mid + 1, high, nodeList);
        node.left = insertIntoBST(low, mid - 1, nodeList);
        return node;
    }

    //Inorder traversal to get a sorted array
    public void travsereInorder(TreeNode root, List<Integer> nodeList) {

        if (root == null) {
            return;
        }
        travsereInorder(root.left, nodeList);
        nodeList.add(root.val);
        travsereInorder(root.right, nodeList);

    }
}
