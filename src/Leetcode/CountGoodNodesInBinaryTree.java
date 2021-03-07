package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/6/21, Sat, 7:56 PM
 **/

//https://leetcode.com/problems/count-good-nodes-in-binary-tree
public class CountGoodNodesInBinaryTree {

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
     * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
     * <p>
     * Return the number of good nodes in the binary tree.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * <p>
     * Input: root = [3,1,4,3,null,1,5]
     * Output: 4
     * Explanation: Nodes in blue are good.
     * Root Node (3) is always a good node.
     * Node 4 -> (3,4) is the maximum value in the path starting from the root.
     * Node 5 -> (3,4,5) is the maximum value in the path
     * Node 3 -> (3,1,3) is the maximum value in the path.
     * Example 2:
     * <p>
     * <p>
     * <p>
     * Input: root = [3,3,null,4,2]
     * Output: 3
     * Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: 1
     * Explanation: Root is considered as good.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the binary tree is in the range [1, 10^5].
     * Each node's value is between [-10^4, 10^4].
     *
     * @param root
     * @return the number of good nodes in the binary tree.
     */


    //Time Complexity = O(N), where N is the number of nodes
    //Space Complexity = O(N), counting the recursion stack
    public int goodNodes(TreeNode root) {

        int maxVal = Integer.MIN_VALUE;
        int res = checkNode(root, maxVal);
        return res;
    }

    public int checkNode(TreeNode root, int maxVal) {
        if (root == null) {
            return 0;
        }

        int res = root.val >= maxVal ? 1 : 0;
        res += checkNode(root.left, Math.max(root.val, maxVal));
        res += checkNode(root.right, Math.max(root.val, maxVal));
        return res;
    }
}
