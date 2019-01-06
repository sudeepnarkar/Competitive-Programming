package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
 
/**
 * Created by sudeep on 4/7/16.
 */
 class FLOW018
{
    public static void main(String args[]) throws IOException
    {
 
        int i, j;
       // Scanner in = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int n;
         BigInteger fact;
        for (i = 1;i<=num;i++)
        {
            fact=new BigInteger("1");
            n = Integer.parseInt(br.readLine());
            if (n == 1) System.out.println(1);
            else
            {
                for (j = 1; j <= n; j++)
                {
                    fact=fact.multiply(BigInteger.valueOf(j));
 
                }
                System.out.println(fact);
            }
 
        }
    }
}


