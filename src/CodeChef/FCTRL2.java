package CodeChef;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class FCTRL2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  t = sc.nextInt();
        int num;

        if(t>=1 && t<=100){

        for(int i=1;i<=t;i++){

            num = sc.nextInt();

            if(num>=1 && num<=100){
                calcFact(num);
            }
        }


        }


    }

    private static void calcFact(int num) {

       BigInteger factorial=BigInteger.valueOf(1);

        for (int i = 1; i <= num ; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

}
