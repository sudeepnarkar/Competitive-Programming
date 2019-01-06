package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 11/3/17.
 */
public class StringTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] vowels = {"a", "e", "i", "o", "u","y"};

        if(input.length()>=1 && input.length()<=100) {
            input = replaceChars(input);
            input = deleteVowels(input, vowels);
            insertChar(input);
        }

    }

    private static void insertChar(String input) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            s.append(".").append(input.charAt(i));
        }
        System.out.println(s);
    }

    private static String replaceChars(String input) {

        input = input.toLowerCase();
        return input;
    }


    public static String deleteVowels(String input, String[] vowels) {

        for (int i = 0; i < vowels.length; i++) {
            input=input.replace(vowels[i], "");
        }

     //   System.out.println(input);
        return input;
    }
}


