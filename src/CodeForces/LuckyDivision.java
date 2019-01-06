package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 3/4/17.
 */
public class LuckyDivision {
    private static int n;
    private static int len;
    private static String str;
    private static boolean isLucky = false;
    public static void main(String[] args) {


        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            len= str.length();
            n = Integer.parseInt(str);

            switch (len){
                case 1:
                    if(n%7 ==0 || n%4==0)
                        isLucky = true;
                    break;
                case 2:
                    if(n%7 ==0 || n%4==0 || n%47==0 ||n%74==0)
                        isLucky=true;
                    break;
                case 3:
                    if(n%7 ==0 || n%4==0 || n%47==0 ||n%74==0||n%444==0||n%474==0||n%477==0||n%744==0||n%774==0||n%777==0)
                        isLucky=true;
                    break;
                case 4:
                    isLucky=true;

            }
            if(isLucky)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
