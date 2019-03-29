package Leetcode.ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate {


    /*Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in
    the array, and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true*/


    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if (set.contains(n)){
                return true;
            }else{
                set.add(n);
            }
        }
        return false;
    }
}
