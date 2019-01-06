package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sudeep on 7/4/17.
 */
public class InsomniaCure {
    private static long k;
    private static long l;
    private static long m;
    private static long n;
    private static long d;
    private static long count=0;
    private static List <Integer>list = new ArrayList<Integer>();
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            k = Integer.parseInt(br.readLine());
            l = Integer.parseInt(br.readLine());
            m = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            d = Integer.parseInt(br.readLine());

            for (int i = 1; i <=d ; i++) {
                list.add(i);
            }

            if(k==1||l==1||m==1||n==1){
                System.out.println(d);
            }
            else{
                for (Integer val:list) {
                    if(val%k==0 || val%l==0 || val%m==0 || val%n==0)
                        count++;
                }
                System.out.println(count);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
