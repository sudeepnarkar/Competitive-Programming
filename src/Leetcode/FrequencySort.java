package Leetcode;

import java.util.*;

public class FrequencySort {

   /* Given a string, sort it in decreasing order based on the frequency of characters.

            Example 1:

    Input:
            "tree"

    Output:
            "eert"

    Explanation:
            'e' appears twice while 'r' and 't' both appear once.
            So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
            Example 2:

    Input:
            "cccaaa"

    Output:
            "cccaaa"

    Explanation:
    Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
    Note that "cacaca" is incorrect, as the same characters must be together.
*/

    //  faster than 91.55% of Java online submissions for Sort Characters By Frequency.
    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });

        StringBuilder sb= new StringBuilder();
        int count;
        char c;
        for(Map.Entry<Character,Integer> entry:list){
             c = entry.getKey();
             count = entry.getValue();
            while(count>=1){
                sb.append(c);
                count--;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(frequencySort("tree"));
    }
}
