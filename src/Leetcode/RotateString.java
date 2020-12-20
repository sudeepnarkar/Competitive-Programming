package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/30/2020, Mon, 8:20 AM
 **/

//https://leetcode.com/problems/rotate-string
public class RotateString {

    /**
     * We are given two strings, A and B.
     *
     * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
     *
     * Example 1:
     * Input: A = 'abcde', B = 'cdeab'
     * Output: true
     *
     * Example 2:
     * Input: A = 'abcde', B = 'abced'
     * Output: false
     *
     * @param A
     * @param B
     * @return true if A can become B with a number of shifts or return false
     */

    // Time complexity = O (N) where N is the length of A.
    // Space complexity = O (N) i.e = N strings are created to compare with B along with N recursion stack.
    public boolean rotateString(String A, String B) {


        if(A.length() != B.length()){
            return false;
        }

        if(A.equals(B)){
            return true;
        }

        char ch = A.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(A.substring(1)).append(ch);
        return checkString(sb.toString(), A, B);
    }

    public boolean checkString(String temp, String A, String B){

        if(temp.equals(A)){
            return false;
        }
        if(temp.equals(B)){
            return true;
        }
        char ch = temp.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(temp.substring(1)).append(ch);
        return  checkString(sb.toString(), A, B);
    }

    // Time complexity = O (N*M) where N is the length of A and M is the length of B. contains uses a brute force algo with time complexity O(N*M)
    // Space complexity = O(N), space used to build A+A
    public boolean rotateStringWithAddition(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
