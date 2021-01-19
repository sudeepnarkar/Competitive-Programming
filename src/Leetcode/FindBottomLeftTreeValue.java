package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/find-bottom-left-tree-value
public class FindBottomLeftTreeValue {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given a binary tree, find the leftmost value in the last row of the tree.
     * <p>
     * Example 1:
     * Input:
     * <p>
     * 2
     * / \
     * 1   3
     * <p>
     * Output:
     * 1
     * Example 2:
     * Input:
     * <p>
     * 1
     * / \
     * 2   3
     * /   / \
     * 4   5   6
     * /
     * 7
     * <p>
     * Output:
     * 7
     * Note: You may assume the tree (i.e., the given root node) is not NULL.
     *
     * @param root
     * @return value of the boot left node
     */

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N)(worst case), or the level with the maximum level in Tree
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode node = null;
        while (q.size() != 0) {
            node = q.remove();
            if (node.right != null) {
                q.offer(node.right);
            }
            if (node.left != null) {
                q.offer(node.left);
            }
        }
        return node.val;
    }
}
