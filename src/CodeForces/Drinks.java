package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudeep on 6/4/17.
 */
public class Drinks {
    private static int lim;
    private static String[] volFrac;
    private static  double sum = 0.0;
    private static List<Double> list = new ArrayList<Double>();
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            lim = Integer.parseInt(br.readLine());
            volFrac = br.readLine().trim().split("\\s+");

            for (int i = 0; i <volFrac.length ; i++) {
                list.add((Double.parseDouble(volFrac[i])/100));
            }

            for (int i = 0; i <list.size() ; i++) {
                sum+=list.get(i);
            }

            System.out.println((sum/lim)*100);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
