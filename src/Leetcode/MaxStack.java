package Leetcode;

import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/1/2020, Sun, 4:13 PM
 **/

//https://leetcode.com/problems/max-stack
public class MaxStack {

    /**
     * Design a max stack that supports push, pop, top, peekMax and popMax.
     *
     * push(x) -- Push element x onto stack.
     * pop() -- Remove the element on top of the stack and return it.
     * top() -- Get the element on the top.
     * peekMax() -- Retrieve the maximum element in the stack.
     * popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.
     * Example 1:
     * MaxStack stack = new MaxStack();
     * stack.push(5);
     * stack.push(1);
     * stack.push(5);
     * stack.top(); -> 5
     * stack.popMax(); -> 5
     * stack.top(); -> 1
     * stack.peekMax(); -> 5
     * stack.pop(); -> 1
     * stack.top(); -> 5
     */

    /**
     * initialize your data structure here.
     */

    //For every node, keep the val and minVal in the stack
    Stack<Integer> maxStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public MaxStack() {
        Stack<Integer> maxStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        max = max > x ? max : x;
        stack.push(x);
        maxStack.push(max);
    }

    public int pop() {
        if (!maxStack.isEmpty() && !stack.isEmpty()) {
            maxStack.pop();
            return stack.pop();
        }
        return -1;

    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }

    public int peekMax() {
        if (!stack.isEmpty()) {
            return maxStack.peek();
        } else {
            return -1;
        }
    }

    public int popMax() {
        int max = maxStack.peek();
        Stack<Integer> tempStack = new Stack<>();
        if (stack.isEmpty() || maxStack.isEmpty()) {
            return -1;
        }
        while (stack.peek() != max) {
            tempStack.push(pop());
        }
        pop();
        while (!tempStack.empty()) {
            push(tempStack.pop());
        }
        return max;
    }


    public static void main(String[] args) {
        MaxStack obj = new MaxStack();
        obj.push(5);
        obj.push(1);
        obj.push(5);
        int param_1 = obj.top();
        System.out.println(param_1);
        int param_2 = obj.popMax();
        System.out.println(param_2);
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_4 = obj.peekMax();
        System.out.println(param_4);
        int param_5 = obj.pop();
        System.out.println(param_5);
        int param_6 = obj.top();
        System.out.println(param_6);

    }
}
