package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 7/4/17.
 */
public class CalculatingFunction {
    private static long  num;
    private static long  result=0;
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Long.parseLong(br.readLine());

            if(num%2==0)
                result=num/2;
            else
                result = -(num+1)/2;
            System.out.println(result);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
