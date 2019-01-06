package CodeForces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by sudeep on 28/3/17.
 */
public class BoyOrGirl {
    public static void main(String[] args) {

        String line;
        int count=0;
        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        line = sc.nextLine();

        for (int i = 0; i <line.length() ; i++) {
             if(map.containsKey(line.charAt(i))){
                 map.put(line.charAt(i),map.get(line.charAt(i))+1);
             }
             else
                 map.put(line.charAt(i),1);
        }

        for (char key : map.keySet()) {
            if(map.get(key)==1)
                count++;
        }

        if(map.size()%2==1)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");

    }
}
