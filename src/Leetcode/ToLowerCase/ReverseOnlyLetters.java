package Leetcode.ToLowerCase;

public class ReverseOnlyLetters {


    /*Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.



            Example 1:

    Input: "ab-cd"
    Output: "dc-ba"
    Example 2:

    Input: "a-bC-dEf-ghIj"
    Output: "j-Ih-gfE-dCba"
    Example 3:

    Input: "Test1ng-Leet=code-Q!"
    Output: "Qedo1ct-eeLg=ntse-T!"*/


    public String reverseOnlyLetters(String S) {

        char[] arr = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;

        while (i < j) {

            if (!Character.isLetter(arr[i])) {
                i++;
                continue;
            }


            if (!Character.isLetter(arr[j])) {
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return String.valueOf(arr);
    }
}
