package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


  //Given a binary tree, return the inorder traversal of its nodes' values using an iterative solution. Recursive is trivial.

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        TreeNode node = root;
        Stack<TreeNode> st = new Stack<>();
        while(node!=null || st.size()!=0){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}
