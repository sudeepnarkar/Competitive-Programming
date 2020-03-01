package GeeksForGeeks.DataStructures.LinkedList;

public class SinglyLinkedList {


    Node head;

    static class Node {

        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }


    /**
     * Insert node at the head of the linked list
     *
     * @param data The value of the node to be inserted at the head
     */


    void push(int data) {

        Node node = new Node(data);
        if (head == null) {
            node = head;
            return;
        }

        node.next = head;
        head = node;
    }

    /**
     * Inserting the node at the end of the list
     *
     * @param data value of the node to be appended
     */
    void append(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }


    /**
     * @param data        The data for the node to be created
     * @param prevNodeVal The prev node value
     */
    void insertAfter(int data, int prevNodeVal) {

        Node node = new Node(data);
        Node curr = head;

        while (curr.next != null) {
            if (curr.data == prevNodeVal) {
                node.next = curr.next;
                curr.next = node;
                return;
            }
            curr = curr.next;
        }

        // The node is to inserted at the end
        if (curr.next == null) {
            curr.next = node;
        }
    }

    /**
     * @param data value of the node to be deleted
     */

    void deleteFirstOccurance(int data) {

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node curr = head;

        while (curr.next != null) {

            if (curr.next.data == data) {
                curr.next = curr.next.next;
                return;
            } else {
                curr = curr.next;
            }
        }
    }

    /**
     * printing the linkedlist
     */

    void printLL() {
        System.out.println("\nPrinting Singly LinkedList :");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1);
        sll.append(2);
        sll.append(4);
        sll.push(0);

        sll.printLL();

        sll.insertAfter(3, 2);

        sll.printLL();

        sll.deleteFirstOccurance(3);

        sll.printLL();
    }
}
