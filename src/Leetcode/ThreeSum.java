package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {


        List<Integer> input = new ArrayList<>();
        for (int n : nums) {
            input.add(n);
        }

        Collections.sort(input);

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < input.size(); i++) {
            int low = i + 1;
            int high = input.size() - 1;
            while (low < high) {
                int twoSum = input.get(low) + input.get(high);
                if ((twoSum + input.get(i)) > 0) {
                    high--;
                } else if ((twoSum + input.get(i)) < 0) {
                    low++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(input.get(i));
                    list.add(input.get(low));
                    list.add(input.get(high));
                    if (!res.contains(list)) {
                        res.add(list);
                    }
                    low++;
                    high--;
                }

            }
        }
        return res;

    }

    public static void main(String[] args) {

        ArrayList<List<Integer>> list = (ArrayList<List<Integer>>) threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(list);


    }

}
