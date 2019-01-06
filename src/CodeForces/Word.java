package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sudeep on 6/4/17.
 */
public class Word {

    private static String input;
    private static String finalString;
    private static int upperCaseCount=0;
    private static int lowerCaseCount=0;
    private static char ch;
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();

            for (int i = 0; i < input.length(); i++) {
                if(Character.isUpperCase(input.charAt(i)))
                    upperCaseCount++;
                else
                    lowerCaseCount++;

            }

            if(lowerCaseCount==upperCaseCount)
                finalString = input.toLowerCase();
            else if(lowerCaseCount<upperCaseCount)
                finalString = input.toUpperCase();
            else
                finalString = input.toLowerCase();
            System.out.println(finalString);

        }
        catch(Exception e){
                e.printStackTrace();
            }


        }
    }
