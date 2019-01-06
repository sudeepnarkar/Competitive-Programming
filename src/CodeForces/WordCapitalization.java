package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 27/3/17.
 */
public class WordCapitalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = str.charAt(0);

        int ascii = (int) ch;

        if(ascii>=97 && ascii<=122){
            ascii= ascii-32;
        }
        ch = (char)ascii;

        String finalStr = ch+str.substring(1,str.length());
        System.out.println(finalStr);

    }
}
