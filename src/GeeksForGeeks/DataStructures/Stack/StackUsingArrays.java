package GeeksForGeeks.DataStructures.Stack;

public class StackUsingArrays {


    static final int maxSize = 3;
    int top = -1;
    int [] arr = new int[maxSize];

     void push(int num){

        if (top>=maxSize-1){
            System.out.println("Stack overflow");
        }else{
            arr[++top] = num;
        }

         System.out.println("Pushed " +num+ " to the stack");
    }

    int pop(){

        System.out.println("Popping value from the stack");
        if (top<0){
            System.out.println("Stack underflow");
            return -1;
        }else {
            int num = arr[top--];
            return  num;
        }
    }

    void printStack(){

        System.out.println("Printing the stack ..");
         for(int i = top; i >=0;i--){
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
