package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
public class FindLargestValueInEachTreeRow {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,3,2,5,3,null,9]
     * Output: [1,3,9]
     * <p>
     * Example 2:
     * <p>
     * Input: root = [1,2,3]
     * Output: [1,3]
     * <p>
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: [1]
     * <p>
     * Example 4:
     * <p>
     * Input: root = [1,null,2]
     * Output: [1,2]
     * <p>
     * Example 5:
     * <p>
     * Input: root = []
     * Output: []
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree will be in the range [0, 104].
     * -231 <= Node.val <= 231 - 1
     *
     * @param root
     * @return an array of the largest value in each row of the tree (0-indexed)
     */

    //Time Complexity = O(N), where N is the size of all nodes in the tree
    //Space Complexity = O(N) where N is the size of all nodes in the tree worst case (1)
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size;
        int max;
        while (q.size() != 0) {
            size = q.size();
            max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                max = Math.max(max, node.val);
            }
            list.add(max);
        }
        return list;
    }
}
