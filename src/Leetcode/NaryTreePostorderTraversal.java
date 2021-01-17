package Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal
public class NaryTreePostorderTraversal {


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
     * Given an n-ary tree, return the postorder traversal of its nodes' values.
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
     * Output: [5,6,3,2,4,1]
     * <p>
     * Example 2:
     * <p>
     * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The height of the n-ary tree is less than or equal to 1000
     * The total number of nodes is between [0, 10^4]
     *
     * @param root
     * @return return the postorder traversal of its nodes' values.
     */

    //Time Complexity = O(N), where N is the number of nodes in the tree
    //Space Complexity = O(N), where N is the number of nodes in the tree
    public List<Integer> postorder(Node root) {

        Stack<Node> st = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        st.push(root);
        while (st.size() != 0) {
            Node node = st.pop();
            list.addFirst(node.val);
            for (int i = 0; i < node.children.size(); i++) {
                st.push(node.children.get(i));
            }
        }
        return list;
    }
}
