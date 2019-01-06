package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 6/4/17.
 */
public class VasyaAndSocks {
    private static int n;
    private static int m;
    private static int result;
    private static String []line;
    private static int extras;
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            line = br.readLine().trim().split("\\s+");

            n = Integer.parseInt(line[0]);
            m = Integer.parseInt(line[1]);


            if(n>=m){
               /* if(n/m>=m && n>10){
                    result = n+calculate(n,m);
                    System.out.println(result);
                }
                else
                    System.out.println(n+1);*/

                result = n+calculate(n,m);
                System.out.println(result);

            }
            else if(n==m)
                System.out.println(n+1);
            else
                System.out.println(n);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    static int calculate(int n, int m){

        if(n/m!=0) {
            return n/m+calculate(n/m+n%m,m);
        }
            return  n/m;
    }
}
