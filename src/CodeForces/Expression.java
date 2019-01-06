package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 4/4/17.
 */
public class Expression {

    private static int a;
    private static int b;
    private static int c;
    private static int result ;
    private static int tempResult;
    private static int tempResult1;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());

            if(a==1 && b==1 && c==1){
                result = a+b+c;
            }
            else if (a!=1 && b!=1 && c!=1){

                result=a*b*c;
            }
            else{
                result = (a+b)*c > (a*b)+c ? (a+b)*c:(a*b)+c;
                tempResult= a+(b*c) > a*(b+c) ?a+(b*c):a*(b+c);
                tempResult1=a+b+c;
                result = Math.max(Math.max(result,tempResult),tempResult1);
            }

            System.out.println(result);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
