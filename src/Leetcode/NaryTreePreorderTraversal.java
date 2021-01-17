package Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/n-ary-tree-preorder-traversal
public class NaryTreePreorderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * Given an n-ary tree, return the preorder traversal of its nodes' values.
     * <p>
     * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
     * <p>
     * <p>
     * <p>
     * Follow up:
     * <p>
     * Recursive solution is trivial, could you do it iteratively?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,null,3,2,4,null,5,6]
     * Output: [1,3,5,6,2,4]
     * <p>
     * Example 2:
     * <p>
     * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The height of the n-ary tree is less than or equal to 1000
     * The total number of nodes is between [0, 10^4]
     *
     * @param root
     * @return the preorder traversal of its nodes' values.
     */

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N) (worst case),where N is the number of nodes in the tree
    // The average space complexity would be the level with the largest number of nodes in the tree
    public List<Integer> preorder(Node root) {

        Stack<Node> st = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        st.push(root);
        while (st.size() != 0) {
            Node node = st.pop();
            list.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                st.push(node.children.get(i));
            }
        }
        return list;
    }
}
