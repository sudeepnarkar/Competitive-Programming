package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 3/4/17.
 */
public class SoldiersAndBananas {
    private static int k;
    private static int n;
    private static int w;
    private static String []line;
    private static int sum ;
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
                sum = 0;
                line = br.readLine().split("\\s+");
                k = Integer.parseInt(line[0]);
                n = Integer.parseInt(line[1]);
                w = Integer.parseInt(line[2]);

            for (int i = 1; i <=w ; i++) {
                sum+=i*k;
            }
            if(sum-n>=0)
                System.out.println(sum-n);
            else
                System.out.println(0);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
