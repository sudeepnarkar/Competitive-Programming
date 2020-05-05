package Leetcode;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
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
}
