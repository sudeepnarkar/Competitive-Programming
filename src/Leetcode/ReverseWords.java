package Leetcode;

public class ReverseWords {

    public String reverseWords(String s) {

        String [] arr = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = reverse(arr[i]);
        }
        return String.join(" ", arr);
    }

    public String reverse(String str){

        char [] arr = new char[str.length()];
        int index = 0;
        for (int i = str.length()-1;i>=0;i--){
            arr[index++] =  str.charAt(i);
        }
        return new String(arr);
    }
}
