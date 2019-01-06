package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 27/3/17.
 */
public class TheMonster {
    public static void main(String[] args) {

        int a, b, c, d;
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String[] str1 = line1.trim().split("\\s+");

        a = Integer.parseInt(str1[0]);
        b = Integer.parseInt(str1[1]);

        String line2 = sc.nextLine();
        String[] str2 = line2.trim().split("\\s+");

        c = Integer.parseInt(str2[0]);
        d = Integer.parseInt(str2[1]);

        boolean flag = false;
        if (a >= 1 && b <= 100 && c >= 1 && d <= 100) {

            for (int i = 0; i <= 1000; i++) {
                for (int j = 0; j < 1000; j++) {
                    if (b + (i * a) == d + (c * j)) {
                        System.out.println(b + i * a);
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            if (!flag)
                System.out.println(-1);

        }
    }
}
