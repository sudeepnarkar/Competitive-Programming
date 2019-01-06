package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class NextRound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2;

        String[] strs1 = line1.trim().split("\\s+");

        int n, k;

        n = Integer.parseInt(strs1[0]);
        k = Integer.parseInt(strs1[1]);

        int[] scores = new int[n];

        line2 = sc.nextLine();
        String[] strs2 = line2.trim().split("\\s+");


        for (int i = 0; i < strs2.length; i++) {
            scores[i] = Integer.parseInt(strs2[i]);
        }
            calculate(scores, k);
    }

    private static void calculate(int[] scores, int k) {

        int count=0;

        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]>=scores[k-1] && scores[i]>0)
                count++;
        }
        System.out.println(count);
    }
}
