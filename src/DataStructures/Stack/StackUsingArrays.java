package GeeksForGeeks.DataStructures.Stack;

public class StackUsingArrays {


    static final int maxSize = 3;
    int top = -1;
    int[] arr = new int[maxSize];

    /**
     * Push an element into the stack
     *
     * @param num value to be pushed onto the stack
     */

    void push(int num) {

        if (top >= maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = num;
        }

        System.out.println("Pushed " + num + " to the stack");
    }

    /**
     * Pop and element from the stack
     *
     * @return value which is popped off
     */

    int pop() {

        System.out.println("Popping value from the stack");
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int num = arr[top--];
            return num;
        }
    }

    /**
     * Printing the stack
     */

    void printStack() {

        System.out.println("Printing the stack ..");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        StackUsingArrays s = new StackUsingArrays();
        s.push(1);
        s.push(2);
        s.push(3);
        int num = s.pop();
        s.printStack();
    }

}
