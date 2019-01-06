package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * Created by sudeep on 4/7/16.
 */
 class CHN09
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        String str;
        int i,j;
        int a_ctr;
        int b_ctr;
        for(i=1;i<=num;i++)
        {
            str=br.readLine();
            a_ctr=0;
            b_ctr=0;
            for(j=0;j<str.length();j++)
            {
                if (str.charAt(j)=='a')
                    a_ctr++;
                else
                    b_ctr++;
            }
            if(a_ctr<b_ctr)
                System.out.println(a_ctr);
            else if (b_ctr<a_ctr)
                System.out.println(b_ctr);
            else if (a_ctr==b_ctr)
                System.out.println(b_ctr);
 
 
        }
 
 
    }
 
}


