package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowelsOfString {

   /* Write a function that takes a string as input and reverse only the vowels of a string.

            Example 1:

    Input: "hello"
    Output: "holle"
    Example 2:

    Input: "leetcode"
    Output: "leotcede"*/



    public static boolean isVowel(char a){
        switch(a){
            case ('a') : return true;
            case ('e') : return true;
            case ('i') : return true;
            case ('o') : return true;
            case ('u') : return true;
            case ('A') : return true;
            case ('E') : return true;
            case ('I') : return true;
            case ('O') : return true;
            case ('U') : return true;
            default : return false;
        }
    }

    public String reverseVowels(String s) {

        char [] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while(i<j){

            if(!isVowel(arr[i])){
                i++;
                continue;
            }
            if(!isVowel(arr[j])){
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return String.valueOf(arr);
    }
}
