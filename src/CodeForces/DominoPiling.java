package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */
public class DominoPiling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();

        String[] strs1 = line1.trim().split("\\s+");

        int M, N, area, domino_num;

        M = Integer.parseInt(strs1[0]);
        N = Integer.parseInt(strs1[1]);

        area = M*N;

        if(M<=N && 1<=M && N<=16) {

            domino_num = area / 2;

            System.out.println(domino_num);
        }
    }
}
