package GeeksForGeeks.DataStructures;

public class SinglyLinkedList {


    Node head;

    static class Node{

        Node next;
        float data;

        public Node(float data) {
            this.next = null;
            this.data = data;
        }
    }

    /*
    * Inserting at the head of the Linked List
    * */

    void deleteFirstOccurance(float data){

        if (head.data == data){
            head = head.next;
            return;
        }

        Node curr = head;

        while(curr.next!=null){

           if (curr.next.data == data){
                curr.next = curr.next.next;
                return;
           }else{
               curr = curr.next;
           }

        }
    }
    void push(int data){

        Node node = new Node(data);
        if (head == null){
            node = head;
            return;
        }

        node.next = head;
        head = node;
    }

    /*
    * Inserting after the prev node in the Linked List
    * */
    void insertAfter(float data, Node prevNode){


        if (prevNode == null){
            System.out.println("The given node cannot be null");
        }

        Node node = new Node(data);

        Node curr = head;

        while(curr.next!=null){
            if (curr == prevNode){
                node.next = curr.next;
                curr.next = node;
                return;
            }
            curr = curr.next;
        }

    }

    /*
    * Inserting at the end of the Linked List
    *
    * */
    void append(int data){

        Node node = new Node(data);
        Node curr = head;

        if (curr == null){
            curr = node;
            return;
        }

        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = node;
    }


    /*
    * Printing the node values of the Linked List
    * */

    void printLL(Node head){

        System.out.println("Printing node values:");
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList sl = new SinglyLinkedList();

        Node node1 = new Node(1);
        sl.head = node1;
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        sl.push(0);

        System.out.println("LinkedList after pushing 0");
        sl.printLL(sl.head);

        sl.insertAfter((float) 2.5,node2);

        System.out.println("LinkedList after inserting 2.5");
        sl.printLL(sl.head);

        sl.append(7);

        System.out.println("LinkedList after appending 7");
        sl.printLL(sl.head);

        sl.deleteFirstOccurance((float) 4.0);

        System.out.println("LinkedList after deleting 4");
        sl.printLL(sl.head);
    }
}
