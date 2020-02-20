package Leetcode;

public class RemoveKDigits {

    /*Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

            Note:
    The length of num is less than 10002 and will be ≥ k.
    The given num does not contain any leading zero.
            Example 1:

    Input: num = "1432219", k = 3
    Output: "1219"
    Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
    Example 2:

    Input: num = "10200", k = 1
    Output: "200"
    Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
            Example 3:

    Input: num = "10", k = 2
    Output: "0"
    Explanation: Remove all the digits from the number and it is left with nothing which is 0.
*/
    public String removeKdigits(String num, int k) {

        int i = 0;
        int len = num.length();

        //cases like num = 12, k = 2
        if (len == k) {
            return "0";
        }

        StringBuilder sb = new StringBuilder(num);
        while (i < sb.length() - 1 && k > 0) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                if (i > 0) {
                    i--;
                }
                k--;
            } else {
                i++;
            }
        }

        //corner cases like  num '1111'
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        //remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return String.valueOf(sb);
    }
}
