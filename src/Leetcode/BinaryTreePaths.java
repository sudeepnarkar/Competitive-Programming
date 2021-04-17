package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 11/19/2020, Thu, 9:49 PM
 **/

//https://leetcode.com/problems/binary-tree-paths
public class BinaryTreePaths {


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
     * Given a binary tree, return all root-to-leaf paths.
     *
     * Note: A leaf is a node with no children.
     *
     * Example:
     *
     * Input:
     *
     *    1
     *  /   \
     * 2     3
     *  \
     *   5
     *
     * Output: ["1->2->5", "1->3"]
     *
     * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
     */



    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree
    List<String> list = new ArrayList<>();
    String split = "->";

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            binaryTreePathsUtil(root, "", list);
        }
        return list;
    }

    public void binaryTreePathsUtil(TreeNode root, String res, List<String> list) {

        if (root.left == null && root.right == null) {
            res += root.val;
            list.add(res);
        }
        if (root.left != null) {
            binaryTreePathsUtil(root.left, res + root.val + split, list);
        }
        if (root.right != null) {
            binaryTreePathsUtil(root.right, res + root.val + split, list);
        }
    }
}
