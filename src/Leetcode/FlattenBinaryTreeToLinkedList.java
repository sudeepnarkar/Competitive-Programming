package Leetcode;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 4/5/21, Mon, 3:08 PM
 **/

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list
public class FlattenBinaryTreeToLinkedList {

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


    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree
    //TODO: Optimize the solution for O(1) space
    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        traversePreorder(q, root);
        root.left = null;
        createFlattenedTree(q, root);
        root.right = root.right.right;

    }

    public static void traversePreorder(Queue<Integer> q, TreeNode root) {
        if (root == null) {
            return;
        }

        q.add(root.val);
        traversePreorder(q, root.left);
        traversePreorder(q, root.right);
    }

    public void createFlattenedTree(Queue<Integer> q, TreeNode root) {

        if (q.size() == 0) {
            return;
        }
        int val = q.remove();
        TreeNode node = new TreeNode(val);
        root.right = node;
        createFlattenedTree(q, root.right);

    }
}
