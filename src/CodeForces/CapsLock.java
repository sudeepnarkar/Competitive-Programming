package CodeForces;

import java.util.Scanner;


/**
 * Created by sudeep on 1/4/17.
 */
public class CapsLock {
    private static String str;
    private static String str1;
    private static int i;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
       i =  checkAllUpper(str);
        if(i==1)
        {
            str1= str.substring(0,str.length()).toLowerCase();
            System.out.println(str1);
        }
        else
        {
           i = checkExceptFirstOne(str);
            if(i==1){
                str1= str.substring(0,1).toUpperCase() +str.substring(1,str.length()).toLowerCase();
                System.out.println(str1);
            }
            else
                System.out.println(str);
        }
    }

    public static int checkAllUpper(String str){

        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }
        if(count==str.length())
            return 1;
        else
            return 0;
    }

    public static int checkExceptFirstOne(String str){

        int countFirst=0;
        int countRest=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i)) && i==0)
                countFirst++;
             else if(Character.isUpperCase(str.charAt(i)))
                 countRest++;

        }
        if(countFirst==1 && countRest==str.length()-1)
            return 1;
        else
            return 0;
    }
}
