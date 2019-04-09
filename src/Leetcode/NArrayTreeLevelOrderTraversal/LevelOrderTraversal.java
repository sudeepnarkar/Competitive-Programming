package Leetcode.NArrayTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

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

    ;


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.remove();
                subList.add(node.val);
                for (int j = 0; j < node.children.size(); j++) {
                    if (node.children.get(j) != null) {
                        q.offer(node.children.get(j));
                    }
                }
            }
            list.add(subList);
        }
        return list;
    }
}
