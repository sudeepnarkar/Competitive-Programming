package CodeChef;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
/**
 * Created by sudeep on 4/7/16.
 */
 class FLOW008
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i;
        int n;
        for(i=1;i<=num;i++)
        {
            n = Integer.parseInt(br.readLine());
            if (n>=-20 && n<10)
                System.out.println("What an obedient servant you are!");
            else
                System.out.println(-1);
 
       }
    }
} 
