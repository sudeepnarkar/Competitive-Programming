package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author : Sudeep Narkar
 * @since : 11/18/2020, Wed, 7:49 AM
 **/

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree
public class SerializeAndDeserializeBinaryTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
     * <p>
     * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
     * <p>
     * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,2,3,null,null,4,5]
     * Output: [1,2,3,null,null,4,5]
     * <p>
     * Example 2:
     * <p>
     * Input: root = []
     * Output: []
     * <p>
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: [1]
     * <p>
     * Example 4:
     * <p>
     * Input: root = [1,2]
     * Output: [1,2]
     */


    // Encodes a tree to a single string.

    private static String split = ",";
    private static StringBuilder sb = new StringBuilder();
    private static String N = "N";

    public String serialize(TreeNode root) {
        return buildString(root, sb);
    }

    // Build the String by traversing the tree in Preorder
    public String buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(N).append(split);
        } else {
            sb.append(root.val).append(split);
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(split);
        LinkedList<String> ll = new LinkedList(Arrays.asList(arr));
        return buildTree(ll);
    }

    // Build the tree in preorder by parsing the String
    public TreeNode buildTree(LinkedList<String> ll) {

        String val = ll.remove();
        if (val.equals(N)) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(ll);
        node.right = buildTree(ll);
        return node;
    }
}

