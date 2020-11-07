package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 11/6/2020, Fri, 7:45 PM
 **/

//https://leetcode.com/problems/n-ary-tree-level-order-traversal
public class NaryTreeLevelOrderTraversal {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * Given an n-ary tree, return the level order traversal of its nodes' values.
     * <p>
     * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: root = [1,null,3,2,4,null,5,6]
     * Output: [[1],[3,2,4],[5,6]]
     * <p>
     * Example 2:
     * <p>
     * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
     */

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (q.size() != 0) {
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.remove();
                for (int j = 0; j < node.children.size(); j++) {
                    Node childNode = node.children.get(j);
                    if (childNode != null) {
                        q.offer(childNode);
                    }
                }
                subList.add(node.val);
            }
            list.add(subList);
        }
        return list;
    }
}
