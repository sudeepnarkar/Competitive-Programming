package DataStructures.Tree;

public class BinarySearchTree {


    Node root = null;

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Inserting a node in a Binary search Tree
     *
     * @param root root of the tree
     * @param val  value of the node to be inserted
     * @return root node of the tree
     */

    Node insertNode(Node root, int val) {

        if (root == null) {
            Node node = new Node(val);
            return node;
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    /**
     * @param root root of the tree
     * @param val  value of the node to be deleted
     * @return root node of the tree
     */

    Node deleteNode(Node root, int val) {

        if (root == null) {
            return null;
        }
        if (root.val < val) {
            root.right = deleteNode(root.right, val);
        } else if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else {
            // This is the node to be deleted.
            // Case 1 : Node has no children
            // Case 2 : Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 : Node with two children. Find the Inorder successor.

            root.val = minValue(root.right);

            root.right = deleteNode(root.right, root.val);
        }

        return root;

    }

    /**
     * Utility function to find the in-order successor.
     *
     * @param root
     * @return value of the inorder successor
     */
    int minValue(Node root) {
        int minValue = root.val;
        while (root.left != null) {
            minValue = root.left.val;
            root = root.left;
        }
        return minValue;
    }

    /**
     * print the tree in-order AKA non-descending order
     *
     * @param root
     */
    void printBST(Node root) {

        if (root == null) {
            return;
        }

        printBST(root.left);
        System.out.println(root.val + " ");
        printBST(root.right);

    }


    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(4);
        bst.root = bst.insertNode(bst.root, 2);
        bst.root = bst.insertNode(bst.root, 12);
        bst.root = bst.insertNode(bst.root, 20);

        System.out.println("Printing BST ..");
        bst.printBST(bst.root);

        System.out.println("deleting val 12");
        bst.root = bst.deleteNode(bst.root, 12);

        System.out.println("Printing BST ..");
        bst.printBST(bst.root);

    }
}
