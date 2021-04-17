package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 3/7/21, Sun, 11:36 AM
 **/

//https://leetcode.com/problems/deepest-leaves-sum
public class DeepestLeavesSum {


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
     * Given the root of a binary tree, return the sum of values of its deepest leaves.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
     * Output: 15
     * Example 2:
     * <p>
     * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
     * Output: 19
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [1, 104].
     * 1 <= Node.val <= 100
     *
     * @param root
     * @return the sum of values of its deepest leaves.
     */

    //Time Complexity = O(N), where N is the number of nodes in the Tree
    //Space Complexity = O(M), where M is the number of nodes in level with highest number of nodes
    public int deepestLeavesSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        LinkedList<Integer> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        int i;
        while (q.size() != 0) {
            int size = q.size();
            for (i = 0, sum = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                //Initialize the val of sum to 0 in every level order traversal
                // The last val of sum will be the sum of the deepest leaves
                sum += node.val;
            }
        }
        return sum;
    }
}
