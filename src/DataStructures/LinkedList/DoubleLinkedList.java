package DataStructures.LinkedList;

public class DoubleLinkedList {

    Node head;

    static class Node {

        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.next = null;
            this.prev = null;
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
        head.prev = node;
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
        node.prev = curr;
    }

    /**
     * @param data        The data for the node to be created
     * @param prevNodeVal The prev node value
     */

    void insertAfter(int data, int prevNodeVal) {

        Node curr = head;
        Node node = new Node(data);
        while (curr.next != null) {
            if (curr.data == prevNodeVal) {
                node.next = curr.next;
                curr.next.prev = node;
                curr.next = node;
                node.prev = curr;
                return;
            } else {
                curr = curr.next;
            }
        }

        if (curr.next == null) {
            curr.next = node;
            node.prev = curr;
        }
    }

    /**
     * @param data value of the node to be deleted
     */

    void deleteFirstOccurance(int data) {

        if (head == null) {
            System.out.println("Empty DLL. Cannot delete.");
        }

        if (head.data == data) {
            head = head.next;
        }

        Node curr = head;

        while (curr.next != null) {
            // node to be deleted is the last node
            if (curr.next.data == data) {
                if (curr.next.next == null) {
                    curr.next = null;
                } else {
                    curr.next.next.prev = curr;
                    curr.next = curr.next.next;
                }
                return;
            } else {
                curr = curr.next;
            }
        }
    }

    /**
     * printing the linkedlist
     */

    void printDLL() {

        Node curr = head;
        System.out.println("\nPrinting Doubly LinkedList :");

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.push(0);

        dll.printDLL();

        dll.deleteFirstOccurance(0);

        dll.printDLL();

        dll.insertAfter(4, 3);

        dll.printDLL();

    }
}
