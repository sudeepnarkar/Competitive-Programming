package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class Watermelons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=1 && num<=100)
            canDivideEqual(num);
    }

    private static void canDivideEqual(int num) {

        int canDivide = 0;
        for(int i=1; i<num;i++){

            if (i%2 == 0 && ((num-i)%i==0)) {
                //System.out.println("YES");
                canDivide = 1;
                break;
            }
        }
        if(canDivide==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
