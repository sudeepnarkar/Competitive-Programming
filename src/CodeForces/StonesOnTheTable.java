package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */
public class StonesOnTheTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        if(num>=1 && num <=50 && str.length()==num ){

            calculateMinimumNoOfStones(str);

        }

    }


    private static void calculateMinimumNoOfStones(String str) {

        int count =0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                str=str.substring(0, i+1) + str.substring(i+1,str.length());
                count++;
            }
        }
        System.out.println(count);
    }



}
