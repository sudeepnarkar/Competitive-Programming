package DataStructures.Stack;

public class StackUsingLinkedList {

    Node top = null;


    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Push an element into the stack
     *
     * @param num value to be pushed onto the stack
     */

    void push(int num) {


        Node node = new Node(num);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        System.out.println("Pushed " + num + " to the stack");
    }

    /**
     * Pop and element from the stack
     *
     * @return value which is popped off
     */

    Node pop() {

        System.out.println("Popping value from the stack");

        if (top == null) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            Node node = top;
            top = top.next;
            return node;
        }
    }

    /**
     * Printing the stack
     */

    void printStack() {

        System.out.println("Printing stack ..");

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(1);
        ;
        s.push(2);
        s.push(3);

        Node node = s.pop();

        s.printStack();
    }
}
