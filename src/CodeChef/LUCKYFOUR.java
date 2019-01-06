package CodeChef;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
/**
 * Created by sudeep on 4/7/16.
 */
 class LUCKYFOUR
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Integer.parseInt(br.readLine());
        int i,j;
        int ctr;
        String str;
        for(i=1;i<=num;i++)
        {
            ctr=0;
            str=br.readLine();
            //System.out.println(str[2]);
            for(j=0;j<str.length();j++)
            {
                if (str.charAt(j)=='4')
                ctr++;
            }
            System.out.println(ctr);
        }
 
    }
} 
