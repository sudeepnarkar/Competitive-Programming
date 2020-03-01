package GeeksForGeeks.DataStructures.Queue;

public class QueueUsingLinkedList {

    Node front;
    Node rear;

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Adding element to the rear of the queue
     *
     * @param data element to be added
     */

    public void enqueue(int data) {

        Node node = new Node(data);

        if (front == null) {
            front = node;
            rear = node;
            return;
        }

        rear.next = node;
        rear = node;

        System.out.println("Enqueued the node with value " + data);
    }

    /**
     * Removing element from the head of the queue
     *
     * @return element at the head
     */

    public Node dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        Node node = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Node with value " + node.data + " dequeued from the queue");

        return node;
    }

    /**
     * Printing the queue
     */

    public void printQueue() {

        System.out.println("Printing the values in the queue");

        Node curr = front;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();

        q.printQueue();

    }

}
