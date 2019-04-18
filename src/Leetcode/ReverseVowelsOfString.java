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

    public String reverseVowels(String s) {

        ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        char [] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while(i<j){

            if(!list.contains(arr[i])){
                i++;
                continue;
            }
            if(!list.contains(arr[j])){
                j--;
                continue;
            }

            if(arr[i] == arr[j]){
                i++;j--;
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
