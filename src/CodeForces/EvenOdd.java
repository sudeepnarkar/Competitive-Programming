package CodeForces;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */

//incomplete
public class EvenOdd {

    static int index = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num;
        long position;
        long [] range = new long[1000];
        String line = sc.nextLine();

        String[] strArr = line.trim().split("\\s+");

        num = Long.parseLong(strArr[0]);
        position = Long.parseLong(strArr[1]);

       // System.out.println(num);

        addOdd(num, range);
        addEven(num, range);

        System.out.println(range[(int)position-1]);

    }

    private static void addOdd(long num, long[] range) {


        for (int i = 1; i <= num; i++) {

            if (i % 2 == 1) {
                range[index] = i;
                index++;
            }
        }
    }

    private static void addEven(long num, long[] range) {

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                range[index] = i;
                index++;
            }
        }

    }

}
