package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */
public class YoungPhysicist {
    static int sum;
    static int x_ctr=0;
    static int y_ctr=0;
    static int z_ctr=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str;
        int [] x_array = new int[100];
        int [] y_array = new int[100];
        int [] z_array = new int[100];

        int x_sum=0;
        int y_sum=0;
        int z_sum=0;

        int x,y,z;
        int n = sc.nextInt();
        sc.nextLine();
        String line;
        if(n>=1 && n<=100){

            for (int i = 0; i <n; i++) {

                line = sc.nextLine();

                str = line.trim().split("\\s+");

                x = Integer.parseInt(str[0]);
                y = Integer.parseInt(str[1]);
                z = Integer.parseInt(str[2]);

                if(x>=-100 && x<=100 && y>=-100 && y<=100 && z>=-100 && z<=100){
                    x_array[x_ctr]=x;
                    y_array[y_ctr]=y;
                    z_array[z_ctr]=z;
                    x_ctr++; y_ctr++; z_ctr++;
                }
            }
        }

        for (int i = 0; i <x_array.length ; i++) {
            x_sum+=x_array[i];
        }
        for (int i = 0; i <y_array.length ; i++) {
            y_sum+=y_array[i];
        }
        for (int i = 0; i <z_array.length ; i++) {
            z_sum+=z_array[i];
        }

        if (x_sum==0 && y_sum==0 && z_sum==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
