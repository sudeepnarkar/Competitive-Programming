package CodeForces;

/**
 * Created by sudeep on 4/4/17.
 */
public class Stack {
    private static int maxSize;
    private static long[]stackArray;
    private static int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }
    public static void push(long i){
        stackArray[++top]= i;
    }

    public static long pop(){

        return stackArray[top--];
    }

    public  static long peek(){
        return stackArray[top];
    }
    public static boolean isEmpty(){
        return top==-1;
    }

    public static boolean isFull(){
        return top==maxSize-1;
    }

    public  static void main(String []args){

        Stack st = new Stack(10);
        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            long value = st.pop();
            System.out.println(value);
        }

    }


}
