package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */
public class GeorgeAndAccomodation {

    static int count = 0;

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String str;
            int n = sc.nextInt();
            sc.nextLine();
            String[] strArr;

            for (int i = 0; i < n; i++) {
                str = sc.nextLine();
                strArr = str.trim().split("\\s+");
                calculateNoOfRooms(strArr);
            }
            System.out.println(count);
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }

    private static void calculateNoOfRooms(String[] strArr) {

        int living = Integer.parseInt(strArr[0]);
        int capacity = Integer.parseInt(strArr[1]);
        if (capacity - living >= 2 && living<=capacity) {
            count++;
        }
    }
}