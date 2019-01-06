package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */

// Not working
public class Candies {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        if(n%m == 0) {
            for (int i = 0; i <m ; i++) {
                System.out.print(" "+n/m);
            }
        }
        else{

        }


    }
}
