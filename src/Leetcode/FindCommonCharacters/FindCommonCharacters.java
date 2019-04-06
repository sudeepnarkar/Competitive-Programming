package Leetcode.FindCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {


   /* Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).
   For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
   You may return the answer in any order.

            Example 1:

    Input: ["bella","label","roller"]
    Output: ["e","l","l"]
    Example 2:

    Input: ["cool","lock","cook"]
    Output: ["c","o"]*/


    public List<String> findCommonChars(String[] A) {

        ArrayList<String> res = new ArrayList<>();

        int []dict  = new int[26];

        for (int i = 0; i <A[0].length() ; i++) {
            dict[A[0].charAt(i)-'a']++;
        }
        for (int i = 1; i <A.length ; i++) {
            int [] cnt = new int[26];
            for (int j = 0; j <A[i].length() ; j++) {
                cnt[A[i].charAt(j)-'a']++;
            }
            for (int j = 0; j<26 ; j++) {
                if (cnt[j]<dict[j]){
                    dict[j] = cnt[j];
                }
            }

        }
        for (int i = 0; i <26 ; i++) {
            while (dict[i]>0){
                res.add(Character.toString((char)(i+'a')));
                dict[i]--;
            }
        }
        return res;
    }
}
