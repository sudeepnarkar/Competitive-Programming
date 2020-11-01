package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/1/2020, Sun, 1:17 PM
 **/

//https://leetcode.com/problems/min-stack
public class MinStack {

    /**
     *
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     *
     *
     * Example 1:
     *
     * Input
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * Output
     * [null,null,null,null,-3,null,0,-2]
     *
     * Explanation
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin(); // return -3
     * minStack.pop();
     * minStack.top();    // return 0
     * minStack.getMin(); // return -2
     */

    /**
     * initialize your data structure here.
     */
    //For every node, keep the val and minVal in the stack
    Stack<Node> minStack = new Stack<>();

    static class Node {
        int minVal;
        int val;

        Node(int val, int minVal) {
            this.val = val;
            this.minVal = minVal;
        }
    }

    public MinStack() {
        Stack<Node> minStack = new Stack<>();
    }

    public void push(int x) {
        Node n;
        if (!minStack.empty()) {
            int minVal = minStack.peek().minVal;
            minVal = Math.min(x, minVal);
            n = new Node(x, minVal);
        } else {
            n = new Node(x, x);
        }
        minStack.push(n);
    }

    public void pop() {
        if (!minStack.empty()) {
            minStack.pop();
        }
    }

    public int top() {
        if (!minStack.isEmpty()) {
            return minStack.peek().val;
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.empty()) {
            return minStack.peek().minVal;
        } else {
            return -1;
        }
    }
}
