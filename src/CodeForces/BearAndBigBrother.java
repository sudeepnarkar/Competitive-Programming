package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 6/4/17.
 */
public class BearAndBigBrother {
    private static long a;
    private static long b;
    private static String []line;
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            line = br.readLine().trim().split("\\s+");

            a = Long.parseLong(line[0]);
            b = Long.parseLong(line[1]);

            for (int i = 1; i <10000 ; i++) {

                a = a*3;
                b = b*2;

                if(a>b) {
                    System.out.println(i);
                    break;
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
