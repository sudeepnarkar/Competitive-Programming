package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 8/4/17.
 */
public class NewYearCandles {
    private static int a;
    private static int b;
    private static int result;
    private static String []line;
    private static int extras;
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            line = br.readLine().trim().split("\\s+");

            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);


            if(a >= b){
                result = a +calculate(a, b);
                System.out.println(result);

            }
            else if(a == b)
                System.out.println(a +1);
            else
                System.out.println(a);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    static int calculate(int a, int b){

        if(a/b!=0) {
            return a/b+calculate(a/b+a%b,b);
        }
        return  a/b;
    }
}
