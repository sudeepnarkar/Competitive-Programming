package CodeChef;

import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class TEST {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        while (true)
        {
            num= sc.nextInt();
            if(num<100 && num!=42) {
                System.out.println(num);
            }
            else
                break;
        }
    }

}
