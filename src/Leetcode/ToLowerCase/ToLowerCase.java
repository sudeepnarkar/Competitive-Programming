package Leetcode.ToLowerCase;

public class ToLowerCase {

    public static String toLowerCase(String str) {
        /*char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);*/

        char [] arr = new char[str.length()];
        for(int i =0;i<str.length();i++){
            int ch = (int)(str.charAt(i));
            if (ch<=90 && ch>=65){
                arr[i] = (char)(ch+32);
            }else{
                arr[i] = (char)ch;
            }
        }
        return String.valueOf(arr);

    }

    public static void main(String[] args) {

        System.out.println(toLowerCase("Hello"));
    }

}
