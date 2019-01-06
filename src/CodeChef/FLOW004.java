package CodeChef;

import java.util.Scanner;
 
/**
 * Created by sudeep on 4/7/16.
 */
 class FLOW004
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j;
        long sum;
        int num=in.nextInt();
        String arr[];
        for(i=1;i<=num;i++)
        {   sum=0;
            arr=in.next().split("");
            for(j=0;j<arr.length;j++)
            {
                if(j==0||j==arr.length-1)
                sum+=Integer.parseInt(arr[j]);
            }
            System.out.println(sum);
        }
    }
} 
