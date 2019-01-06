package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sudeep on 1/4/17.
 */
public class Team {
    private static int testCases=0;
    private static String line;
    private static String[] inputArr;
    private static List<Integer> list = new ArrayList<Integer>();
    private static int count;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        testCases = sc.nextInt();
        sc.nextLine();

        count=0;
        if(testCases>=1 && testCases<=1000){
            for (int i = 0; i <testCases ; i++) {

                line = sc.nextLine();
                inputArr=line.trim().split("\\s+");
                list.clear();
                for (String str: inputArr) {
                    list.add(Integer.parseInt(str));
                }

                if(Collections.frequency(list,1)>=2)
                    count++;
            }
        }

        System.out.println(count);

    }
}
