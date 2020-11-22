package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/21/2020, Sat, 6:03 PM
 **/

//https://leetcode.com/problems/inorder-successor-in-bst
public class InorderSuccessorInBST {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given a binary search tree and a node in it, find the in-order successor of that node in the BST.
     * <p>
     * The successor of a node p is the node with the smallest key greater than p.val.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [2,1,3], p = 1
     * Output: 2
     * Explanation: 1's in-order successor node is 2. Note that both p and the return value is of TreeNode type.
     * <p>
     * Example 2:
     * <p>
     * Input: root = [5,3,6,2,4,null,null,1], p = 6
     * Output: null
     * Explanation: There is no in-order successor of the current node, so the answer is null.
     *
     * @param root
     * @param p
     * @return Inorder successor of the node
     */


    public TreeNode inorderSuccessorIterative(TreeNode root, TreeNode p) {
        TreeNode res = null;
        while (root != null) {
            if (root.val > p.val) {
                // can be a candidate for Inorder Successor
                res = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return res;
    }

    TreeNode lastParent = null;

    public TreeNode inorderSuccessorRecursive(TreeNode root, TreeNode p) {
        lastParent = successor(root, p);
        return lastParent;
    }

    public TreeNode successor(TreeNode root, TreeNode p) {

        if (root != null) {
            if (root.val <= p.val) {
                successor(root.right, p);
            } else {
                // can be a candidate for Inorder Successor
                lastParent = root;
                successor(root.left, p);
            }
        }
        return lastParent;
    }


    ArrayList<Integer> list = new ArrayList<>();

    public void traverseBSTInorder(TreeNode root) {
        if (root == null) {
            return;
        }

        traverseBSTInorder(root.left);
        list.add(root.val);
        traverseBSTInorder(root.right);
    }

    public TreeNode inorderSuccessorRecursiveWithArrayList(TreeNode root, TreeNode p) {
        traverseBSTInorder(root);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == p.val && i != size - 1) {
                TreeNode node = new TreeNode(list.get(i + 1));
                return node;
            }
        }
        return null;
    }
}
