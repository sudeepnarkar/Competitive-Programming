package CodeChef;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
/**
 * Created by sudeep on 4/7/16.
 */
class GDOG
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i,j;
        long n,k;
        long ctr;
        String  str[];
        for(i=1;i<=num;i++)
        {
            ctr=0;
            str=br.readLine().split(" ");
            n=Integer.parseInt(str[0]);
            k=Integer.parseInt(str[1]);
            if(n<=100000 && k<=100000)
            {
                for(j=1;j<=k;j++)
                {
 
                        if((n % j)>ctr)
                            ctr=n%j;
 
                }
            }
            System.out.println(ctr);
        }
    }
} 

