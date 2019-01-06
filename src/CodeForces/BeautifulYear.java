package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sudeep on 1/4/17.
 */
public class BeautifulYear {

    private static int input;
    private static List<Integer> list = new ArrayList<Integer>();
    private static int rem;
    private static int num;
    private static  boolean flag =false;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();
        if(input>=1000 && input<=9000){

            for (int i = input+1; i <10000 ; i++) {

                num=i;
                list.clear();
                while(i>=0) {
                        rem = i % 10;
                        if (list.contains(rem)) {
                            break;
                        }
                        else{
                            list.add(rem);
                            i =i/ 10;
                            if((int) Math.log10(i) + 1==0 || i==0) {
                                flag=true;

                            }
                        }
                    }
                    if(flag==true){
                        System.out.println(num);
                        break;
                    }
                    i=num;

            }
           // System.out.println("outside for");
        }

    }
}
