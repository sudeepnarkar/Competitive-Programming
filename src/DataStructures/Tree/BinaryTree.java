package DataStructures.Tree;

public class BinaryTree {


    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Inorder traversal of the binary tree
     * @param node root node
     */
    void printTreeNodes(Node node) {

        if (node == null) {
            return;
        }

        printTreeNodes(node.left);
        System.out.println(node.data);
        printTreeNodes(node.right);
    }

    public static void main(String[] args) {


        BinaryTree b = new BinaryTree();

        Node node = new Node(1);
        node.right = new Node(2);
        node.left = new Node(3);
        node.left.left = new Node(4);

        System.out.println("Printing tree nodes Inorder ..");

        b.printTreeNodes(node);

    }

}
