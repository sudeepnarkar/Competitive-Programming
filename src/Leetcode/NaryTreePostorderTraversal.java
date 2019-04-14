package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {

        Stack<Node> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        st.push(root);
        while(st.size()!=0){
            Node node = st.pop();
            list.add(node.val);
            for(int i = 0;i<node.children.size();i++){
                st.push(node.children.get(i));
            }
        }
        // reverse of preorder
        Collections.reverse(list);
        return list;
    }
}
