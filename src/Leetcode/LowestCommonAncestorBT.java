package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class LowestCommonAncestorBT {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

   /* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
    two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node
            to be a descendant of itself).”*/

    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode left = lowestCommonAncestorRecursive(root.left, p, q);
        TreeNode right = lowestCommonAncestorRecursive(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }else{
            return right;
        }
    }


    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> st = new Stack<>();

        //Map of node as key and parent node as value
        HashMap<TreeNode, TreeNode> map = new HashMap<>();

        TreeNode node = root;
        st.push(node);
        map.put(node, null);

        while(!map.containsKey(p) || !map.containsKey(q)){
            node = st.pop();
            if(node.left!=null){
                map.put(node.left, node);
                st.push(node.left);
            }
            if(node.right!=null){
                map.put(node.right, node);
                st.push(node.right);
            }
        }

        //process ancestors of P;
        HashSet<TreeNode> ancestorsSet = new HashSet<>();
        while(p!=null){
            ancestorsSet.add(p);
            p = map.get(p);
        }

        // Get the first ancestor of q that is in set
        while(!ancestorsSet.contains(q)){
            q = map.get(q);
        }

        return q;
    }
}
