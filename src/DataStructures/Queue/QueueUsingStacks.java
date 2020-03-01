package DataStructures.Queue;

import java.util.Stack;

public class QueueUsingStacks {


    /**
     * Initialize your data structure here.
     */

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();


    public QueueUsingStacks() {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        input.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {

        if (output.empty())
            while (!input.empty())
                output.push(input.pop());

        if (output.isEmpty()) {
            System.out.println("Queue is empty..");
            return -1;
        }
        return output.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {

        // Your MyQueue object will be instantiated and called as such:
        Leetcode.QueueUsingStacks obj = new Leetcode.QueueUsingStacks();
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();

    }
}
