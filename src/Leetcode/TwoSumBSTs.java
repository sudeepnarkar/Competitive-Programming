package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 1/4/2021, Mon, 9:50 PM
 **/

//https://leetcode.com/problems/two-sum-bsts
public class TwoSumBSTs {

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
     * Given two binary search trees, return True if and only if there is a node in the first tree and a node in the second tree whose values sum up to a given integer target.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * <p>
     * Input: root1 = [2,1,4], root2 = [1,0,3], target = 5
     * Output: true
     * Explanation: 2 and 3 sum up to 5.
     * Example 2:
     * <p>
     * <p>
     * <p>
     * Input: root1 = [0,-10,10], root2 = [5,1,7,0,2], target = 18
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * Each tree has at most 5000 nodes.
     * -10^9 <= target, node.val <= 10^
     */

    // Time Complexity = O(N+M), where N and M are the number of nodes in tree1 and tree2
    // Space Complexity = O(N+M), where N and M are the number of nodes in tree1 and tree2

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {

        inorder(root1, list1);
        inorder(root2, list2);

        int low = 0;
        int high = list2.size() - 1;

        // Reducing the problem to a two sum problem
        while (low < list1.size() && 0 <= high) {
            int num1 = list1.get(low);
            int num2 = list2.get(high);
            if (num1 + num2 == target) {
                return true;
            } else if (num1 + num2 < target) {
                low++;
            } else {
                high--;
            }
        }


        return false;
    }

    public void inorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

        return;
    }
}
