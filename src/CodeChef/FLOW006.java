package CodeChef;

import java.util.Scanner;
 
/**
 * Created by sudeep on 4/7/16.
 */
class FLOW006 {
    public static void main(String args[]) {
        int sum = 0;
        int i, j;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str;
        String arr[];
        for (i = 1; i <= num; i++) {
            sum=0;
            arr = in.next().split("");
            for (j = 0; j < arr.length; j++)
            {
                sum += Integer.parseInt(arr[j]);
            }
            System.out.println(sum);
        }
 
    }
}
