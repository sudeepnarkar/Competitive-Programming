package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 7/4/17.
 */
public class NearlyLuckyNumber {
    private static int len;
    private static String line;
    private static int luckyDigitsCount=0;
    public static void main(String[] args) {

        try {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            line = sc.nextLine();

            for (int i = 0; i <line.length() ; i++) {
                if(line.charAt(i)=='4'||line.charAt(i)=='7')
                    luckyDigitsCount++;
            }

            if(luckyDigitsCount==4 || luckyDigitsCount==7)
                System.out.println("YES");
            else
                System.out.println("NO");


        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
