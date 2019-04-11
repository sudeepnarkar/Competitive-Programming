package Leetcode;

import java.util.ArrayList;


public class IncreasingOrderSearchTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode increasingBST(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        list = increasingBSTUtil(root,list);
        int size = list.size();
        TreeNode root1 = new TreeNode(list.get(0));
        TreeNode curr = root1;
        for(int i =1;i<size;i++){
            curr.right =  new TreeNode(list.get(i));
            curr = curr.right;
        }
        return root;
    }


    ArrayList<Integer> increasingBSTUtil(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }

        increasingBSTUtil(root.left,list);
        list.add(root.val);
        increasingBSTUtil(root.right,list);
        return list;
    }
}
