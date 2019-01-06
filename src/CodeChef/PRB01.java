package CodeChef;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
/**
 * Created by sudeep on 4/7/16.
 */
class PRB01
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i,j;
        int ctr;
        int n;
        for(i=1;i<=num;i++)
        {
            n = Integer.parseInt(br.readLine());
            ctr=0;
            if (n>=1 && n<=100000)
            {
                for (j = 1; j <= n; j++)
                {
                    if (n % j == 0)
                        ctr++;
                }
                if (ctr == 2)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
       }
    }
}  

