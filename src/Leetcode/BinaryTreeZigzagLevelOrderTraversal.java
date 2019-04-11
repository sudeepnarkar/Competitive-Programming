package Leetcode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    //Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        int size = 0;
        int flag = 0;
        while(q.size()!=0){
            size = q.size();
            List<Integer> buff = new ArrayList<>();
            for(int i=0; i<size;i++){
                TreeNode node = q.remove();
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                buff.add(node.val);
            }
            if (flag == 1){
                Collections.reverse(buff);
                list.add(buff);
            }else{
                list.add(buff);
            }
            //flipping the flag
            flag = flag ==0?1:0;
        }
        return list;
    }
}