package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.log10;
import static java.lang.StrictMath.abs;

/**
 * Created by sudeep on 2/4/17.
 */
public class MaximumSumOfDigits {

    private static long largestSum;
    private static long sum;
    private static long num;
    private static long number;
    private static long LargestNumber;
    private static int len;

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            largestSum=1;
            for (int i = 1; i <=num ; i++) {
                //len = (int)(Math.log10(i)+1);
                sum = 0;
                number= i;

                while(number!=0){
                    sum+= number%10;
                    number/=10;
                }
                if(sum>=largestSum){
                    largestSum=sum;
                    LargestNumber = i;
                }

            }
            System.out.println(LargestNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
