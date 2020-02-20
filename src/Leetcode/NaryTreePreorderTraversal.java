package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /*Given an n-ary tree, return the preorder traversal of its nodes' values.

    For example, given a 3-ary tree:
*/
    public List<Integer> preorder(Node root) {

        Stack<Node> st = new Stack<>();
            List<Integer> list = new ArrayList<>();
            if(root == null){
                return list;
        }
        st.push(root);
        while(st.size()!=0){
            Node node = st.pop();
            list.add(node.val);
            for(int i = node.children.size()-1;i>=0;i--){
                st.push(node.children.get(i));
            }
        }
        return list;
    }
}
