package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @version : 10/22/2020, Sun, 8:56 AM
 **/

//https://leetcode.com/problems/fizz-buzz/
class FizzBuzz {

    /**
     * Write a program that outputs the string representation of numbers from 1 to n.
     * <p>
     * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
     * <p>
     * Example:
     * <p>
     * n = 15,
     * <p>
     * Return:
     * [
     * "1",
     * "2",
     * "Fizz",
     * "4",
     * "Buzz",
     * "Fizz",
     * "7",
     * "8",
     * "Fizz",
     * "Buzz",
     * "11",
     * "Fizz",
     * "13",
     * "14",
     * "FizzBuzz"
     * ]
     */

    //Time Complexity = O(N)
    //Space Complexity = O(1)
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divByThree = i % 3 == 0;
            boolean divByFive = i % 5 == 0;
            if (divByThree && divByFive) {
                list.add("FizzBuzz");
            } else if (divByThree) {
                list.add("Fizz");
            } else if (divByFive) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public List<String> fizzBuzzV2(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String d = "";
            if (i % 3 == 0) {
                d += "Fizz";
            }
            if (i % 5 == 0) {
                d += "Buzz";
            }
            if (!d.equals("")) {
                list.add(d);
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public List<String> fizzBuzzV3(int n) {
        ArrayList<String> list = new ArrayList<>();
        int c3 = 0;
        int c5 = 0;
        String d = "";
        for (int i = 1; i <= n; i++) {
            c3++;
            c5++;
            if (c3 == 3) {
                d += "Fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                d += "Buzz";
                c5 = 0;
            }

            if (!d.equals("")) {
                list.add(d);
                d = "";
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
