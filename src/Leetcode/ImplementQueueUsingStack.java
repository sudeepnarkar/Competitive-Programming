package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/1/2020, Sun, 11:00 AM
 **/

//https://leetcode.com/problems/implement-queue-using-stacks
public class ImplementQueueUsingStack {

/**
 *
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should
 * support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 *
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 *
 * You must use only standard operations of a stack, which means only push to top, peek/pop from
 * top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack
 * using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */


    /**
     * Initialize your data structure here.
     */

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public ImplementQueueUsingStack() {
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
        if (output.empty()) {
            return -1;
        }
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        if (output.isEmpty()) {
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

        ImplementQueueUsingStack obj = new ImplementQueueUsingStack();
        obj.push(12);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println("Is the queue empty?: " +param_4);
    }
}
