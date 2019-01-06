package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int strLen;
        String input;
        if(t>=1 && t<=100) {
            for (int i = 1; i <= t; i++) {
                 input = sc.nextLine();
                 strLen = input.length();
                 if(strLen>=1 && strLen<=100 && strLen > 10)
                    calculateAbbreviation(input);
                 else
                     System.out.println(input);
            }
        }
    }

    private static void calculateAbbreviation(String input ) {

        String abbr;
        String letBetween = Integer.toString(input.length()-2);
        abbr = input.charAt(0)+letBetween+input.charAt(input.length()-1);
        System.out.println(abbr);
    }

}
