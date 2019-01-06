package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 1/4/17.
 */
public class PetyaandStrings {

    private static String str1;
    private static String str2;
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        int i = str1.toLowerCase().compareTo(str2.toLowerCase());
        if(i==0)
            System.out.println(i);
        else if(i>=1)
            System.out.println(1);
        else
            System.out.println(-1);


    }
}
