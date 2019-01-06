package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sudeep on 29/3/17.
 */
public class RepeatingNumber{

    public static void main(String[] args) {

        String [] strArr1;
        int count;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        strArr1 = line.trim().split("\\s+");

        String [] strArr2= strArr1.clone();

        Set<String> finalSet = new HashSet<>();

        for (int i = 0; i <strArr1.length ; i++) {
            count=0;
            for (int j = 0; j <strArr2.length ; j++) {
                if(strArr1[i].equals(strArr2[j])){
                    count++;
                }
            }
            if(count>1)
                finalSet.add(strArr1[i]);
        }
        for (String str:finalSet) {
            System.out.println(str);
        }
        }
    }

