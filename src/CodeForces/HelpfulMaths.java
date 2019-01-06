package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sudeep on 1/4/17.
 */
public class HelpfulMaths {

    private static List<Integer> list = new ArrayList<Integer>();
    private static String line;
    private static String[] inputArr;
    private static int num;
    private static int ctr;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();

        inputArr = line.trim().split("\\+");

        for (String str:inputArr) {
            num = Integer.parseInt(str);
            list.add(num);
        }

        Collections.sort(list);

        ctr = -1;
        for (Integer i:list) {
            ctr++;
            System.out.print(i);
            if(list.size()-1 != ctr)
                System.out.print("+");
        }
    }

}
