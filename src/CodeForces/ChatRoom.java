package CodeForces;

import java.util.Scanner;

/**
 * Created by sudeep on 12/3/17.
 */
public class ChatRoom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char []arr = {'h','e','l','l','o'};

        int flag=-1;
        int j,i;
        int count=0;
        if(str.length()>=1 && str.length()<=100) {
            for (i = 0; i < arr.length; i++) {
                flag++;
                j = flag;
                while (j < str.length()) {
                    if (arr[i] == str.charAt(j)) {
                        count++;
                        flag = j;
                        break;
                    }
                    j++;
                }
            }
        }
        if(count==5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

